

import java.time.LocalDate;

public class ProjetoDeLei {
	private String titulo;
	protected LocalDate dataApresentacao;
	protected LocalDate dataAprovacao;
	private int numeroProjeto;
	private static int contadorProjetos=1;

	public ProjetoDeLei(String titulo, LocalDate dataApresentacao, LocalDate dataAprovacao) {
		super();
		setTitulo(titulo);
		setDataApresentacao(dataApresentacao);
		setDataAprovacao(dataAprovacao);
		this.numeroProjeto = contadorProjetos;
		contadorProjetos++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		} else {
			throw new IllegalArgumentException("Insira um titulo válido.");
		}
	}

	public LocalDate getDataApresentacao() {
		return dataApresentacao;
	}

	public void setDataApresentacao(LocalDate dataApresentacao) {
		if (dataApresentacao != null) {
			this.dataApresentacao = dataApresentacao;
		} else {
			throw new IllegalArgumentException("Data nula. Digite novamente.");
		}
	}

	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}

	public void setDataAprovacao(LocalDate dataAprovacao) {
		if (dataAprovacao != null) {
			if (this.dataApresentacao.isBefore(dataAprovacao) || this.dataApresentacao.isEqual(dataAprovacao)) {
				this.dataAprovacao = dataAprovacao;
			} else {
				throw new IllegalArgumentException("Data menor que a data de apresentação. Digite novamente.");
			}
		}
	}

	public int getNumeroProjeto() {
		return numeroProjeto;
	}


	public String mostrar() {
		return "Projeto de Lei" + "\nTitulo: " + this.titulo + "\nNumero do projeto: " + this.numeroProjeto
				+ "\nData de apresentação: " + this.dataApresentacao + "\nData de aprovação:  " + this.dataAprovacao;
	}

	public boolean estaAprovado() {
		return (this.dataAprovacao != null);
	}
}
