
import java.time.LocalDate;

public class TelefoneResidencial extends Telefone{
	private boolean conexaoInternet;

	public TelefoneResidencial(String nome, String endereco, 
			LocalDate dataInstalacao, boolean conexaoInternet,
			String numero) {
		super(nome, endereco, dataInstalacao, numero);
		setConexaoInternet(conexaoInternet);
	}

	public double getValorBasico() {
		return 15;
	}

	public boolean isConexaoInternet() {
		return conexaoInternet;
	}

	public void setConexaoInternet(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}

	public String getAddInfo() {
		if (this.conexaoInternet) {
			return "Conexao Internet: Sim";
		}
		return "Conexao Internet: Nao";
	}
}