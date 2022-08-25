
public class VetorDeReais {
	private double[] vetor;

	public VetorDeReais(int tamanho) {
		vetor = new double[tamanho];
	}

	// item a
	public void setValor(double valor, int posicao) {
		this.vetor[posicao] = valor;
	}

	// item b
	public int getQuantidadePares() {
		int contador = 0;

		for (int i = 0; i < this.vetor.length; i++) {
			if ((int) this.vetor[i] % 2 == 0) { // parte inteira é par?
				contador++;
			}
		}

		return contador;
	}

	// item c
	public VetorDeReais divide(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return null;
		}
		VetorDeReais novo = new VetorDeReais(this.vetor.length);
		double aux;
		for (int i = 0; i < this.vetor.length; i++) {
			aux = this.vetor[i] / outro.getValor(i);
			novo.setValor(aux, i);
		}

		return novo;
	}

	public double getValor(int posicao) {
		return this.vetor[posicao];
	}

	// item d
	public double multiplica(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return Double.NaN; // Not a Number
		}
		double m = 0;

		for (int i = 0, j = this.vetor.length - 1; i < this.vetor.length; i++, j--) {
			m += this.vetor[i] * outro.getValor(j);
		}

		return m;
	}

	public int getTamanho() {
		return this.vetor.length;
	}

	// item e
	public void inverte() {
		double aux = 0;

		for (int i = 0, j = vetor.length - 1; i < vetor.length / 2; i++, j--) {
			aux = this.vetor[i];
			this.vetor[i] = this.vetor[j];
			vetor[j] = aux;
		}
	}

	// item f
	public double maiorDiferenca() {
		double maior = 0;
		for (int i = 0; i < vetor.length - 1; i++) {
			double aux = Math.abs(vetor[i] - vetor[i + 1]);
			if (aux > maior) {
				maior = aux;
			}
		}
		return maior;
	}

	public String exibir() {
		String str = "[";
		for (int i = 0; i < this.getTamanho(); i++) {
			str += this.vetor[i] + ", ";
		}
		return str + "]";
	}

}

// sugestão de bibliografia para exercitar aspectos básicos de programação
// LOPES, Anita; GARCIA, Guto. Introdução à programação: 500 algoritmos resolvidos. 
// Rio de Janeiro : Elsevier : Campus, 2002. 469 p, il. +, 1 CD-ROM.
