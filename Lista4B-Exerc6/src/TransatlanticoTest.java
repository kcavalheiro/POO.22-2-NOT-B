import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TransatlanticoTest {
	
	
	@Test
	void testeBoteOK() {
		// Arrange
		BoteSalvaVidas b1 = new BoteSalvaVidas("BSV 001",28,5,28,true);
		// Act
		String teste = b1.verificaSeguranca();
		
		// Assert
		assertEquals("Bote OK",teste);
	}
	
	@Test
	void testeBoteInsuficiencia_20() {
		// Arrange
		BoteSalvaVidas b1 = new BoteSalvaVidas("BSV 001",48,5,28,true);
		// Act
		String teste = b1.verificaSeguranca();
		
		// Assert
		assertEquals("Insuficiência de 20 coletes salva-vidas",teste);
	}
	
	@Test
	void testeTransatlanticoSeguro() {
		// Arrange
		Transatlantico t = new Transatlantico("FTR 1267", 2365, LocalDate.parse("2010-05-14"),"Titanic II");
		BoteSalvaVidas b1 = new BoteSalvaVidas("BSV 001",788,5,28,true);
		BoteSalvaVidas b2 = new BoteSalvaVidas("BSV 1966", 788,12,145,false);
		
		t.addBote(b1);
		t.addBote(b2);
		t.addBote("BSV 244", 789,12,120,false);
		
		// Act
		String teste = t.verificaSeguranca();
		
		// Assert
		assertEquals("Está em condições adequadas de segurança",teste);
	}
	
	@Test
	void testeTransatlanticoCuidado() {
		// Arrange
		Transatlantico t = new Transatlantico("FTR 1267", 2365, LocalDate.parse("2010-05-14"),"Titanic II");
		BoteSalvaVidas b1 = new BoteSalvaVidas("BSV 001",788,5,28,true);
		BoteSalvaVidas b2 = new BoteSalvaVidas("BSV 1966", 788,12,145,false);
		t.addBote(b1);
		t.addBote(b2);
		t.addBote("BSV 244", 78,12,120,false);
		
		// Act
		String teste = t.verificaSeguranca();
		
		// Assert
		assertEquals("CUIDADO: navio em perigo",teste);
	}
	
	@Test
	void testeTransatlanticoAlerta() {
		// Arrange
		Transatlantico t = new Transatlantico("FTR 1267", 2365, LocalDate.now().plusDays(2),"Titanic II");
		BoteSalvaVidas b1 = new BoteSalvaVidas("BSV 001",788,5,28,true);
		BoteSalvaVidas b2 = new BoteSalvaVidas("BSV 1966", 788,12,145,false);
		BoteSalvaVidas b3 = new BoteSalvaVidas("BSV 244", 78,12,120,false);
		
		// Act
		t.addBote(b1);
		t.addBote(b2);
		t.addBote(b3);
		
		String teste = t.verificaSeguranca();
		
		// Assert
		assertEquals("ALERTA: navio necessitando de mais botes!",teste);
	}
}
