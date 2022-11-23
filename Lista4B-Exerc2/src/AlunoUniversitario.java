import java.time.LocalDate;

public class AlunoUniversitario extends Aluno  {
	private char formaIngresso;
	private Curso curso;

	public AlunoUniversitario(String nome, LocalDate dataNascimento, Curso curso, char formaIngresso) {
		super(nome, dataNascimento);
		this.setCurso(curso);
		this.setFormaIngresso(formaIngresso);
	}

	public AlunoUniversitario(String nome, LocalDate dataNascimento, Curso curso, String formaIngresso) {
		super(nome, dataNascimento);
		this.setCurso(curso);
		this.setFormaIngresso(formaIngresso);
	}

	@Override
	public String mostra() {
		// Jo�o Carlos � aluno universit�rio do curso de SIS�Sistemas de Informa��o, ingressando por ENEM.
		return this.nome + " � aluno universit�rio do curso de " 
				+ this.curso.getSigla() + " - " + this.curso.getNome()
				+ ", ingressando por " + this.getFormaIngresso();
	}

	public String getFormaIngresso() {
		switch (this.formaIngresso) {
		case 'V':
			return "Vestibular";
		case 'E':
			return "Enem";
		case 'S':
			return "Seletivo";
		case 'T':
			return "Transfer�ncia";
		case 'I':
			return "Interna";
		}
		return null;
	}

	public void setFormaIngresso(String formaIngresso) {
		this.setFormaIngresso(formaIngresso.trim().charAt(0));
	}

	public void setFormaIngresso(char formaIngresso) {
		formaIngresso = Character.toUpperCase(formaIngresso);
		if (formaIngresso == 'V' || formaIngresso == 'E' || formaIngresso == 'S' 
				|| formaIngresso == 'T' || formaIngresso == 'I') {
			this.formaIngresso = formaIngresso;
		}else {
        	throw new IllegalArgumentException("Ingresso deve ser V,E,S,T I.");
        }
		
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destruindo universit�rio:"+this.nome);
		super.finalize();
	}

	
}