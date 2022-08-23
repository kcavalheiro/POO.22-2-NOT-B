
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
		
		for (int i=0; i < this.vetor.length; i++) {
			if ((int)this.vetor[i] % 2 == 0) {  // parte inteira é par?
				contador++;
			}
		}
		
		return contador;
	}
}
