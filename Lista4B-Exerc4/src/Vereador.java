

import java.util.ArrayList;

public class Vereador { // contribuição do Felipe
    private String nome;
    private Partido partido;
    private ArrayList<ProjetoDeLei> projetosDeLei = new ArrayList<>();
    
    
	public Vereador(String nome) {
		super();
		setNome(nome);
	}
	
	public ArrayList<ProjetoDeLei> getProjetoDeLei() {
		return this.projetosDeLei;
	}
	
	
    public double getindiceTrabalho() {
        if (this.getProjetos() == 0) {
            return 0.0;
        } else if (this.getProjetos() <= 5) {
            return 0.8;
        } else if (this.getProjetos() <= 10) {
            return 1.0;
        } else if (this.getProjetos() <= 17) {
            return 1.00;
        } else {
            return 1.22;
        }
    }
    public double getDesempenho() {
        if (this.getProjetos() == 0) {
            return 0;
        }
        return (this.getProjetosAprovados() / (double) this.getProjetos()) * this.getindiceTrabalho();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public int getProjetos() {
        return this.projetosDeLei.size();
    }
    
    public int getProjetosAprovados() {
    	int projetosAprovados = 0;
    	for (ProjetoDeLei p: this.projetosDeLei) {
    		if (p.estaAprovado()) {
    			projetosAprovados++;
    		}
    	}
        return projetosAprovados;
    }
    
	public boolean addProjetoDeLei(ProjetoDeLei projeto) {
		if (projeto != null && projetosDeLei.contains(projeto) == false) {
			projetosDeLei.add(projeto);
			return true;
		} else {
			throw new IllegalArgumentException("Projeto já existente ou inválido.");
		}
	}

	public ArrayList<ProjetoDeLei> getProjetosDeLei() {
		return projetosDeLei;
	}

	public void setProjetosDeLei(ArrayList<ProjetoDeLei> projetosDeLei) {
		this.projetosDeLei = projetosDeLei;
	}
	
	
}