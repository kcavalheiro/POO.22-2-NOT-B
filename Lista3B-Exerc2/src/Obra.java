
public class Obra {
	private String titulo;
	private String autor;
	private Parecer[] pareceres = new Parecer[3];
	private int indice;

	public void addParecer(Parecer p) {
		if (indice < pareceres.length) {
			pareceres[indice] = p;
			indice++;
		}
	}
	
	public Parecer getParecer(int posicao) {
		return pareceres[posicao];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdePareceres() {
		return indice;
	}

}
