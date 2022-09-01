

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste InteiroPositivoTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class InteiroPositivoTest
{
    @Test 
    public void testCaso01_Valor10(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(10);
        assertEquals(3628800, ip.fatorial());
    }
    
    @Test 
    public void testCaso02_Valor20(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(20);
        assertEquals(2432902008176640000L, ip.fatorial());
    }
    
    @Test
    void testcaso03_IdentificaDivisoresInteiros() {
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(14);
        assertEquals("Os divisores são 1,2,7,14, e a quantidade de divisores é 4", 
                        ip.identificaDivisoresInteiros());
    }
    
    @Test
    void testcaso04_IdentificaDivisoresInteiros1() {
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(18);
        assertEquals("Os divisores são 1,2,3,6,9,18, e a quantidade de divisores é 6",
                        ip.identificaDivisoresInteiros());
    }
    
    @Test
    void testCaso05_setValor9() {
        // Arrange
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(9);
        int[] vetor = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        // Act & Assert
        assertArrayEquals(vetor, ip.fibonacci());
    }
}
