import java.time.LocalDate;

public class ShowMusical extends Evento {
	private String nomeBanda;
	private String estiloMusical;
	
	public ShowMusical(String titulo, double valor, LocalDate data, String nomeBanda, String estiloMusical) {
		super(titulo, valor, data);
		setNomeBanda(nomeBanda);
		setEstiloMusical(estiloMusical);
	}
	public String getNomeBanda() {
		return nomeBanda;
	}
	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	 @Override
	 public String exibir() {
			String str = "";
			Avaliacao a = this.getAvaliacao();
			if(a != null) {
				str = "Show musical "+  this.getTitulo() + " de " + this.getEstiloMusical() +" de " + this.getNomeBanda() + "com ingresso a R$" + this.getValor() + ", contou com" + a.getQtdPagantes() + "pagantes que acharam o evento" + a.getOpiniaoGeral(); 
			}else {
				str = "Show musical " + this.getTitulo() + " de " + this.getNomeBanda() + "com igresso a R$" + this.getValor() + ", dia " + this.getData() + ".Ainda não avaliado";
			}
			return str;
	 }
	
	
	
}
