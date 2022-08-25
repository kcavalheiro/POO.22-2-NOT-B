
public class ExemploPrincipal {
	public static void main(String[] args) {
		VetorDeReais primeiro = new VetorDeReais(5);
		VetorDeReais segundo = new VetorDeReais(5);
		
		primeiro.setValor(4.5, 0);
		primeiro.setValor(-1.3, 1);
		primeiro.setValor(20, 2);
		primeiro.setValor(31.7, 3);
		primeiro.setValor(-20.0, 4);
		
		segundo.setValor(5.0, 0);
		segundo.setValor(4.0, 1);
		segundo.setValor(3.0, 2);
		segundo.setValor(2.0, 3);
		segundo.setValor(1.0, 4);
		System.out.println("Primeiro:"+primeiro.exibir());
		System.out.println("Segundo:"+segundo.exibir());
		VetorDeReais terceiro = primeiro.divide(segundo);
		System.out.println("Terceiro:"+terceiro.exibir());
		
		double mult = primeiro.multiplica(segundo);
		System.out.println("PrimeiroxSegundo:"+mult);
		
		System.out.println("Maior diferença do primeiro:"+primeiro.maiorDiferenca());
		primeiro.inverte();
		System.out.println("Primeiro invertido:"+primeiro.exibir());
		System.out.println("Maior diferença do primeiro:"+primeiro.maiorDiferenca());
	}
	
}
