

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Camara { // contribuição do Mauricio M
	private HashMap<Integer, Partido> partidos = new HashMap<>();

	public Camara() {
	}

	public boolean addPartido(Partido umPartido) {
		if (partidos.containsKey(umPartido.getNumero())) {
			return false;
		} else {
			partidos.put(umPartido.getNumero(), umPartido);
			return true;
		}
	}
	
	
	public Partido getPartido(int num) {
		return partidos.get(num);
	}

	public int getTotalProjAprov() {
		if (!partidos.isEmpty()) {
			int total = 0;
			List<Partido> lista = new ArrayList<>(partidos.values());
			for (Partido p : lista) {
				total += p.getTotalProjetosAprovados();
			}
			return total;
		}
		return -1;// -1 será o parâmetro enviado para a interface caso não tenha nada no HashMap
	}

	public int getTotalProjApres() {
		if (!partidos.isEmpty()) {
			int total = 0;
			List<Partido> lista = new ArrayList<>(partidos.values());
			for (Partido p : lista) {
				total += p.getTotalProjetosApresentados();
			}
			return total;
		}
		return -1;// -1 será o parâmetro enviado para a interface caso não tenha nada no HashMap
	}

	public double getDesempMedio() {
		if (!partidos.isEmpty()) {
			double media = 0;
			int qtde = 0;
			List<Partido> lista = new ArrayList<>(partidos.values());
			for (Partido p : lista) {
				media += p.getQtdeVereadores() * p.getMediaDesempenho();
				qtde += p.getQtdeVereadores();
			}
			return media / qtde;
		}
		return -1;
	}

	public Vereador getVereadorMaisProjAprov() {
		if (!partidos.isEmpty()) {
			List<Partido> lista = new ArrayList<>(partidos.values());
			Vereador maior = null;
			Vereador atual;
			for (Partido p : lista) {
				atual = p.getVereadorMaisProjAprovados();
				if (maior == null || atual.getProjetosAprovados() > maior.getProjetosAprovados()) {
					maior = atual;
				}
			}
			return maior;
		}
		return null;// null será o parâmetro enviado para a interface caso não tenha nada no HashMap
	}

	public Vereador getVereadorMenorDesemp() {
		if (!partidos.isEmpty()) {
			List<Partido> lista = new ArrayList<>(partidos.values());
			Vereador menor = null;
			for (Partido p : lista) {
				for (Vereador v : p.getVereadores()) {
					if (menor == null || v.getDesempenho() < menor.getDesempenho()) {
						menor = v;
					}
				}
			}
			return menor;
		}
		return null; // null será o parâmetro enviado para a interface caso não tenha nada no HashMap
	}

	public HashMap<Integer, Partido> getTodosOsPartidos() {
		return partidos;
	}
	
	public ArrayList<Vereador> getVereadoresAcimaMedia() {
		if (!partidos.isEmpty()) {
			ArrayList<Vereador> listaVerAcimaMedia = new ArrayList<>();
			double cacheDesempMedio = this.getDesempMedio();
			List<Partido> lista = new ArrayList<>(partidos.values());
			for (Partido p : lista) {
				listaVerAcimaMedia.addAll(p.getVereadoresDesempAcima(cacheDesempMedio));
			}
			return listaVerAcimaMedia;
		}
		return null;
	}

}