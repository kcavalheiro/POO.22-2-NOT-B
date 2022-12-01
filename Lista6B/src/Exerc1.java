import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exerc1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Veiculo> veiculos = new LinkedList<Veiculo>();
		
		Veiculo a = new Veiculo("A", "fusca", 2001,"micael");
		Veiculo b = new Veiculo("AB", "uno", 2000,"micael");
		Veiculo c = new Veiculo("ABC", "picasso", 2000,"micael");
		Veiculo d = new Veiculo("ABD", "hb20", 2001,"micael");
		Veiculo e = new Veiculo("ABE", "civic", 2007,"micael");
		Veiculo f = new Veiculo("ABF", "fiesta", 2000,"micael");
		Veiculo g = new Veiculo("ABG", "brasília", 2010,"micael");
		Veiculo h = new Veiculo("ABH", "kombi", 2020,"micael");
		Veiculo i = new Veiculo("ABI", "onix", 2020,"micael");
		Veiculo j = new Veiculo("ABJ", "sla", 2000,"micael");
		 
		veiculos.add(a);
		veiculos.add(b);
		veiculos.add(c);
		veiculos.add(d);
		veiculos.add(e);
		veiculos.add(f);
		veiculos.add(g);
		veiculos.add(h);
		veiculos.add(i);
		veiculos.add(j);
		
		System.out.println("Lista de veículos");
		System.out.println(veiculos);
		
		veiculos.remove(6); // remove pela posição (sétimo elemento)
		veiculos.remove(j); // remove pelo objeto
		
		ListIterator<Veiculo> it = veiculos.listIterator(veiculos.size()-2);
	    Veiculo r = it.previous();
	    it.remove();

		System.out.println("Após remoção");
		System.out.println(veiculos);
		
		Collections.shuffle(veiculos);
		System.out.println("Bagunçando...");
		System.out.println(veiculos);
		Collections.sort(veiculos);
		System.out.println("Após ordenar por placa");
		System.out.println(veiculos);
		
		Collections.shuffle(veiculos);
		ComparaAnoPlaca comparador = new ComparaAnoPlaca();
		Collections.sort(veiculos,comparador);
		System.out.println("Após ordenar por ano e placa");
		System.out.println(veiculos);
	}
}
