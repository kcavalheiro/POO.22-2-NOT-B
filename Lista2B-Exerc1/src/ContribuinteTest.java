import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {


	@Test
	void testCaso01_GetImposto_Renda3000_ImpostoZero() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(3000);

		// Act
		double imposto = c.getImposto();

		// Assert
		assertEquals(0, imposto);
	}

	@Test
	void testCaso02_GetImposto_Renda9000_Imposto522() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(9000);

		// Act
		double imposto = c.getImposto();

		// Assert
		assertEquals(522.0, imposto);
	}

	@Test
	void testCaso03_GetImposto_Renda10000_Imposto1500() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(10000);

		// Act & Assert
		assertEquals(1500.0, c.getImposto());
	}
	
	@Test
	void testCaso04_GetImposto_Renda34911_Imposto9600() {
		// arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911.73);

		// act & assert

		assertEquals(9600.72, c.getImposto(), 0.009);
	}
	
	@Test
	void testCaso05_RendaInvalida() {
		// arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911);
		c.setRendaAnual(-818.5);

		// act & assert
		assertEquals(34911, c.getRendaAnual());
	}
	
	@Test
	void testCaso06_setUF_SC() {
		// arrange
		Contribuinte c = new Contribuinte();
		c.setUf("SC");

		// act & assert
		assertEquals("SC", c.getUf());
	}
	
	@Test
	void testCaso07_setUF_PR() {
		// arrange
		Contribuinte c = new Contribuinte();
		c.setUf("PR");

		// act & assert
		assertEquals("PR", c.getUf());
	}
	
	@Test
	void testCaso08_setUF_RS() {
		// arrange
		Contribuinte c = new Contribuinte();
		c.setUf("RS");

		// act & assert
		assertEquals("RS", c.getUf());
	}
	
	@Test
	void testCaso09_setUF_SP_Invalido() {
		// arrange
		Contribuinte c = new Contribuinte();
		c.setUf("SP");
		// act & assert
		assertNull(c.getUf());
	}
	
	@Test
	void testCaso10_setUF_RJ_Invalido() {
		// arrange
		Contribuinte c = new Contribuinte();
		c.setUf("SC");
		c.setUf("RJ");
		// act & assert
		assertEquals("SC",c.getUf());
	}
	
	
}
