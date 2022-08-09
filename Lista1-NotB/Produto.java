
/**
 * Escreva uma descrição da classe Produto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Produto // contribuição do Caike
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int desconto;


    /**
     * Construtor para objetos da classe Produto
     */
    public Produto(String nome, String descricao, double precoUnitario, int desconto)
    {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPrecoUnitario(precoUnitario);
        this.setDesconto(desconto);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public double getPrecoUnitario(){
        return this.precoUnitario;
    }

    public void setPrecoUnitario(double preco)
    {
        this.precoUnitario = preco;
    }

    public int getDesconto(){
        return this.desconto;
    }

    public void setDesconto(int desconto)
    {
        this.desconto = desconto;
    }


}