
public class Vereador { // contribuição do Carlos

	private String nome;
	private Partido partido;
	private int qtdProjApres;
	private int qtdProjAprov;

	public Vereador() {
	}

	public Vereador(String nome, Partido partido, int apres, int aprov) {
		this.setNome(nome);
		this.setPartido(partido);
		this.setQtdProjApres(apres);
		this.setQtdProjAprov(aprov);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
		partido.addVereador(this);  // para vincular em ambos os lados da relação
	}

	public int getQtdProjApres() {
		return qtdProjApres;
	}

	public void setQtdProjApres(int qtdProjApres) {
		if (qtdProjApres >= 0) {
			this.qtdProjApres = qtdProjApres;
		}
	}

	public int getQtdProjAprov() {
		return qtdProjAprov;
	}

	public void setQtdProjAprov(int qtdProjAprov) {
		if (qtdProjAprov >= 0) {
			this.qtdProjAprov = qtdProjAprov;
		}
	}

	public double calculaIndiceTrabalho() {
		if (this.qtdProjApres >= 1 && this.qtdProjApres <= 5) {
			return 0.8;
		} else if (this.qtdProjApres >= 6 && this.qtdProjApres <= 10) {
			return 1;
		} else if (this.qtdProjApres >= 11 && this.qtdProjApres <= 17) {
			return 1.08;
		} else if (this.qtdProjApres > 17) {
			return 1.22;
		}

		return 0;
	}

	public double calculaDesempenho() {
		return (this.qtdProjAprov / this.qtdProjApres) * this.calculaIndiceTrabalho();
	}

}
