public class Cidade { // colaboração do Caike
    private String nome;
    private String uf;
    private int popMasc;
    private int popFem;
    private boolean calculado;
    
    public Cidade(String nome, int popMasc, int popFem) {
        this.setNome(nome);
        this.setPopMasc(popMasc);
        this.setPopFem(popFem);
    }

    public Cidade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getPopMasc() {
        return popMasc;
    }

    public void setPopMasc(int popMasc) {
        this.popMasc = popMasc;
    }

    public int getPopFem() {
        return popFem;
    }

    public void setPopFem(int popFem) {
        this.popFem = popFem;
    }

    public boolean isCalculado() {
        return calculado;
    }

    public void setCalculado(boolean calculado) {
        this.calculado = calculado;
    }

}