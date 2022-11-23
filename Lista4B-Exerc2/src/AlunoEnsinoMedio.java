import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno  {
   private short ano;

   public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, short ano) {
        super(nome, dataNascimento); // chamando o construtor da superclasse (Aluno)
        this.setAno(ano);
    }

   public short getAno() {
        return ano;
    }

   public void setAno(short ano) {
        if (ano >= 1 && ano <= 3) {
            this.ano = ano;
        }else {
        	throw new IllegalArgumentException("Ano deve ser de 1 a 3.");
        }
    }


   @Override
    public String mostra() {
	   // Carlos Pinheiro est� cursando o 1o ano do ensino m�dio e tem 14anos.
        return this.nome + " est� cursando o "
        		+ this.ano + "� ano do ensino m�dio e tem "
                + this.getIdade() + " anos.";        
    }
    
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destruindo ensino m�dio:"+this.nome);
		super.finalize();  // chamando o destrutor da superclasse (Aluno)
	}
}