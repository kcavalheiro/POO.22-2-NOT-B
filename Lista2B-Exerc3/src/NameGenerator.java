
public class NameGenerator {

    public static String generateStarWarsName(String[] entrada) {
        String nomeCompleto = entrada[0];
        String sobrenomeMae = entrada[1];
        String cidadeNasc = entrada[2];
        
        String[] nomes = nomeCompleto.split(" ");
        String primeiroNome = nomes[0];
        String sobrenome = nomes[nomes.length - 1];
        
        String nomeStarWars = "";
        nomeStarWars += sobrenome.substring(0, 3);
        nomeStarWars += primeiroNome.toLowerCase().substring(0, 2);
        nomeStarWars += " ";
        nomeStarWars += sobrenomeMae.substring(0, 2);
        nomeStarWars += cidadeNasc.toLowerCase().substring(0, 3);
        
        return nomeStarWars;
    }
    
}
