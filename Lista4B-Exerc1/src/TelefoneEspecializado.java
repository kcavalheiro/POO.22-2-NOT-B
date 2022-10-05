
import java.time.LocalDate;

public class TelefoneEspecializado extends Telefone {
	private int qtdOcorrencia;

	public TelefoneEspecializado(String n, String e, 
			LocalDate d, int qtdOcorrencia,
			String nro) {
		super(n,e,d,nro);
		setQtdOcorrencia(qtdOcorrencia);
	}

	public void setQtdOcorrencia(int qtdOcorrencia) {
		if (qtdOcorrencia > 0) {
			this.qtdOcorrencia = qtdOcorrencia;
		} else {
			throw new IllegalArgumentException("Quantidade de ocorrencias invalida");
		}
	}

	public int getQtdOcorrencia() {
		return qtdOcorrencia;
	}

	public double getValorBasico() {
		if (this.qtdOcorrencia >= 1 && this.qtdOcorrencia <= 1000) {
			return 50;
		} else if (this.qtdOcorrencia >= 1001 && this.qtdOcorrencia <= 5000) {
			return 67.80;
		} else if (this.qtdOcorrencia >= 5001 && this.qtdOcorrencia <= 10000) {
			return 98.50;
		} else if (this.qtdOcorrencia >= 10001 && this.qtdOcorrencia <= 50000) {
			return 123.90;
		} else { 
			return 187.82;
		}

	}
	
	public String getAddInfo() {
		return "Qtde Ocorrencias: " + this.qtdOcorrencia;
	}
}

