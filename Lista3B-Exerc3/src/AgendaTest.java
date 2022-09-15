import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class AgendaTest {

	@Test
	void test01AddDataAgendaValidas() {
		Agenda a = new Agenda();
		DataAgenda dia1 = new DataAgenda();
		dia1.setData(LocalDate.of(2022, 9, 14));
		a.addDataAgenda(dia1);
		
		DataAgenda dia2 = new DataAgenda();
		dia2.setData(LocalDate.of(2022, 9, 15));
		a.addDataAgenda(dia2);
		
		assertSame(dia1,a.getDataAgenda(LocalDate.of(2022, 9, 14)));
		assertSame(dia2,a.getDataAgenda(LocalDate.of(2022, 9, 15)));
	}

	@Test
	void test02AddDataAgendaInvalidas() {
		Agenda a = new Agenda();
		DataAgenda dia1 = new DataAgenda();
		dia1.setData(LocalDate.of(2022, 9, 14));
		a.addDataAgenda(dia1);
		
		DataAgenda dia2 = new DataAgenda();
		dia2.setData(LocalDate.of(2022, 9, 14));
		a.addDataAgenda(dia2);
		
		assertSame(dia1,a.getDataAgenda(LocalDate.of(2022, 9, 14)));
	}
	
	@Test
	void test03GetMenorCompromisso() {
		Agenda a = new Agenda();
		DataAgenda dia1 = new DataAgenda();
		dia1.setData(LocalDate.of(2022, 9, 14));
		a.addDataAgenda(dia1);
		
		DataAgenda dia2 = new DataAgenda();
		dia2.setData(LocalDate.of(2022, 9, 15));
		a.addDataAgenda(dia2);
		
		Compromisso c11 = new Compromisso(LocalTime.of(10, 0),"test11",120,'A');
		Compromisso c12 = new Compromisso(LocalTime.of(10, 10),"test12",20,'A');
		Compromisso c13 = new Compromisso(LocalTime.of(12, 0),"test13",50,'A');
		dia1.addCompromisso(c11);
		dia1.addCompromisso(c12);
		dia1.addCompromisso(c13);
		
		Compromisso c21 = new Compromisso(LocalTime.of(10, 0),"test21",80,'A');
		Compromisso c22 = new Compromisso(LocalTime.of(10, 10),"test22",21,'A');
		Compromisso c23 = new Compromisso(LocalTime.of(12, 0),"test23",50,'A');
		dia2.addCompromisso(c21);
		dia2.addCompromisso(c22);
		dia2.addCompromisso(c23);	
		
		assertSame(c12,a.getMenorCompromisso());
	}
	
	@Test
	void test04DataAgendaTempoMedio() {
		DataAgenda dia1 = new DataAgenda();
		dia1.setData(LocalDate.of(2022, 9, 14));
		
		Compromisso c11 = new Compromisso(LocalTime.of(10, 0),"test11",120,'A');
		Compromisso c12 = new Compromisso(LocalTime.of(10, 10),"test12",40,'A');
		Compromisso c13 = new Compromisso(LocalTime.of(12, 0),"test13",50,'A');
		dia1.addCompromisso(c11);
		dia1.addCompromisso(c12);
		dia1.addCompromisso(c13);
		
		assertEquals(70,dia1.getTempoMedio());
	}
	

}
