
public class BoteSalvaVidas extends Embarcacao {
	private boolean inflavel;
	private int qtdeRemos;
	private int qtdeColetes;
	
	
	public BoteSalvaVidas(String registroCapitania, int qtdePessoas,int qtdeRemos,int qtdeColetes, boolean inflavel) {
		super(registroCapitania, qtdePessoas);
		this.setQtdeRemos(qtdeRemos);
		this.setQtdeColetes(qtdeColetes);
		this.setInflavel(inflavel);
	}
	
	public boolean isInflavel() {
		return inflavel;
	}
	public void setInflavel(boolean inflavel) {
		this.inflavel = inflavel;
	}
	public int getQtdeRemos() {
		return qtdeRemos;
	}
	public void setQtdeRemos(int qtdeRemos) {
		this.qtdeRemos = qtdeRemos;
	}
	public int getQtdeColetes() {
		return qtdeColetes;
	}
	public void setQtdeColetes(int qtdeColetes) {
		this.qtdeColetes = qtdeColetes;
	}

	public String verificaSeguranca() {
		String str = "Bote OK";
		
		if(this.getQtdeColetes() < this.getQtdePessoas()) {
			int insuficiencia = this.getQtdePessoas()-this.getQtdeColetes();
			str = "Insuficiência de "+insuficiencia+" coletes salva-vidas";
		}
		
		return str;
	}
	
}
