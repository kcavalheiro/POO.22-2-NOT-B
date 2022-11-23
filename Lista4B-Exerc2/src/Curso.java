import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Curso implements Serializable {
	private String sigla;
	private String nome;

	public Curso(String sigla, String nome) {
		this.setSigla(sigla);
		this.setNome(nome);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		if (sigla.length() == 3) {
			this.sigla = sigla;
		}else {
        	throw new IllegalArgumentException("Sigla deve ter 3 letras.");
        }
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 5) {
			this.nome = nome;
		}else {
        	throw new IllegalArgumentException("Nome do curso inv�lido");
        }
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destruindo curso:"+this.sigla);
	}

	public String toString() {
		return this.sigla+" - "+this.nome;
	}
}