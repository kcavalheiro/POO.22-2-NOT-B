import java.time.LocalDate;
import java.util.ArrayList;

public class Transatlantico extends Embarcacao {
	private String nome;
	private LocalDate dataInauguracao;
	private ArrayList<BoteSalvaVidas> botes = new ArrayList<>();

	public Transatlantico(String registroCapitania, int qtdePessoas, LocalDate dataInauguracao, String nome) {
		super(registroCapitania, qtdePessoas);
		this.setNome(nome);
		this.setDataInauguracao(dataInauguracao);
	}

	public void addBote(BoteSalvaVidas b) {
		if (b != null) {
			botes.add(b);
		} else
			throw new IllegalArgumentException("Bote não pode ser nulo");
	}

	public void addBote(String registroCapitania, int qtdePessoas, int qtdeRemos, int qtdeColetes, boolean inflavel) {
		BoteSalvaVidas b = new BoteSalvaVidas(registroCapitania, qtdePessoas, qtdeRemos, qtdeColetes, inflavel);
		botes.add(b);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(LocalDate dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	private int capacidadeTotalBotes() {
		int total = 0;
		for (BoteSalvaVidas b : botes) {
			total += b.getQtdePessoas();
		}
		return total;
	}

	@Override
	public String verificaSeguranca() {
		String str = "Está em condições adequadas de segurança";
		if (capacidadeTotalBotes() < getQtdePessoas()) {
			LocalDate hoje = LocalDate.now();
			if (dataInauguracao.isAfter(hoje)) {
				str = "ALERTA: navio necessitando de mais botes!";
			} else {
				str = "CUIDADO: navio em perigo";
			}
		}
		return str;
	}

}
