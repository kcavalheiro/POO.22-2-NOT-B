import java.time.LocalDate;
import java.util.ArrayList;

public class DataAgenda {
	private LocalDate data;
	private String efemeride;
	private ArrayList<Compromisso> compromissos = new ArrayList<>();

	public void addCompromisso(Compromisso compromisso) {
		for (Compromisso c : compromissos) {
			if (c.getHora().equals(compromisso.getHora())) {
				return; // interromper e retornar, sem adicionar
			}
		}
		compromissos.add(compromisso);
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEfemeride() {
		return efemeride;
	}

	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}

	public int getTempoMedio() {
		int total = 0;
		for (Compromisso c : compromissos) {
			total += c.getTempo();
		}
		return total / compromissos.size();
	}

	public int getQtdCompromissosPrioridade(char prior) {
		int conta = 0;
		for (Compromisso c : compromissos) {
			if (c.getPrioridade() == prior) {
				conta++;
			}
		}
		return conta;
	}

	public ArrayList<Compromisso> getCompromissosPrioridade(char prior) {
		ArrayList<Compromisso> retorno = new ArrayList<>();
		for (Compromisso c : compromissos) {
			if (c.getPrioridade() == prior) {
				retorno.add(c);
			}
		}
		return retorno;
	}
	
	public Compromisso getMenorCompromisso() {
		Compromisso menor = null;
		for (Compromisso c : compromissos) {
			if (menor == null || c.getTempo() < menor.getTempo()) {
				menor = c;
			}
		}
		return menor;
	}

}
