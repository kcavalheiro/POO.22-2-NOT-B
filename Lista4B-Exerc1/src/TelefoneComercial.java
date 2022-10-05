

import java.time.LocalDate;

public class TelefoneComercial extends Telefone {
	private String ramoAtividade;

	public TelefoneComercial(String _nome, String _endereco, 
			LocalDate _dataInstalacao, String ramoAtividade,
			String _numero) {
		super(_nome, _endereco, _dataInstalacao, _numero);
		setRamoAtividade(ramoAtividade);
	}

	public void setRamoAtividade(String ramoAtividade) {
		if (ramoAtividade.length() > 0) {
			this.ramoAtividade = ramoAtividade;
		} else {
			throw new IllegalArgumentException("Inválido!!");
		}
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}

	public double getValorBasico() {
		// aqui tem acesso direto ao atributo dataInstalacao pois foi declarado protected
		if (this.dataInstalacao.isBefore(LocalDate.of(2019, 01, 01))) {
			return 25;
		} else {
			return 37.50;
		}
	}

	public String getAddInfo() {
		return "Ramo de atividade: "+this.ramoAtividade;
	}

}