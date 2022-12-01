
public class Veiculo implements Comparable<Veiculo>{ // contribuição do Pedro
    private String placa;
    private String modelo;
    private int ano;
    private String proprietario;

    public Veiculo(String placa, String modelo, int ano, String proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String toString() {
        return "Veiculo " + this.getModelo() + ", placa " + this.getPlaca() + ", ano " + this.getAno() + ", de " + this.getProprietario();
    }

	@Override
	public int compareTo(Veiculo outro) {
		return this.getPlaca().compareTo(outro.getPlaca());
	}
 
}
