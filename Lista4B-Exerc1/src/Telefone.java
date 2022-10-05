import java.time.LocalDate;

public abstract class Telefone {
	private String nome;
	private String endereco;
	protected LocalDate dataInstalacao; // para exemplificar a diferença entre private e protected
	private String numero;
	
	public Telefone(String nome, String endereco, 
			LocalDate dataInstalacao, String numero) {
		setDataInstalacao(dataInstalacao);
		setEndereco(endereco);
		setNome(nome);
		setNumero(numero);
	}

	public abstract double getValorBasico();
	public abstract String getAddInfo();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Inválido!!!");
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 0) {
			this.endereco = endereco;
		} else {
			throw new IllegalArgumentException("Inválido!!!");
		}
	}

	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(LocalDate dataInstalacao) {
		if (dataInstalacao != null) {
			this.dataInstalacao = dataInstalacao;
		} else {
			throw new IllegalArgumentException("Inválido!!!");
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero.length() > 0) {
	        numero.replace("(", "");
	        numero.replace(")", "");
	        numero.replace(" ", "");
	        numero.replace("-", "");
	        this.numero = numero;
		} else {
			throw new IllegalArgumentException("Inválido!!!");
		}
	}

}
