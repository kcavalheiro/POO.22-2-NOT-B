import java.time.LocalDate;

public class Parecer {
	private String parecerista;
	private LocalDate data;
	private String conteudo;

	public String getParecerista() {
		return parecerista;
	}

	public void setParecerista(String parecerista) {
		if (parecerista != null && !parecerista.isBlank()) {
			this.parecerista = parecerista;
		}
		else {
			IllegalArgumentException excecao = new IllegalArgumentException("NOME DO PARECERISTA INVÁLIDO");
			throw excecao;
		}
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		if (conteudo == null || conteudo.isBlank()) {
			throw new IllegalArgumentException("Conteúdo do parecer deve ser informado.");
		}
		this.conteudo = conteudo;
	}

}
