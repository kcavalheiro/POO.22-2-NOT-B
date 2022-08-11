
/**
 * Escreva uma descrição da classe InteiroPositivo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class InteiroPositivo
{
    // atributos
    private int x;

    // item a
    public void setValor(int valor){
        if (valor >= 0){
            this.x = valor;
        }
    }
    
    public int getValor(){
        return this.x;
    }
    
    // item b
    public int multiplicar(InteiroPositivo outro){
        return outro.getValor() * this.x;
    }
    
    // item c
    public long fatorial(){
        long resultado = 1;
        for (int i=this.x; i>0; i--){
            resultado = resultado*i;
        }
        return resultado;
    }
    
    // item d
    public String identificaDivisoresInteiros(){
        String str = "Os divisores são ";
        int contador = 0;
        for (int divisor = 1; divisor <= this.x; divisor++){
            if (this.x % divisor == 0) {
                str += divisor+", ";
                contador++;
            }
        }
        return str +" e a quantidade de divisores é "+contador+".";
        //return "Os divisores são 1, 2, 3, 4, 6, 12 e a quantidade de divisores é 6.";
    }
}
