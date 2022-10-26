import java.time.LocalDate;
import java.time.Period;



public abstract class Aluno implements Comparable<Aluno> {
    
    protected String nome;
    protected LocalDate dataNascimento;
    
    public Aluno(String nome, LocalDate dataNascimento) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
    }


   @Override
	public int compareTo(Aluno outro) {
		return this.nome.compareTo(outro.getNome());
	}



public abstract String mostra();
    
    public int getIdade() {
    	return Period.between(dataNascimento,LocalDate.now()).getYears();
        //return LocalDate.now().getYear() - this.dataNascimento.getYear();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome.length() >= 5) {
            this.nome = nome;            
        }
        else {
        	throw new IllegalArgumentException("Nome do aluno inválido.");
        }
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


	@Override
	protected void finalize() throws Throwable {
		System.out.println("Passando no destrutor Aluno:"+this.nome);
	}



}