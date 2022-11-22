import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class Exerc3 {
	public int[] histograma(Path p) {
		int[] frequencia = new int[256];
		// try with resources
		try (FileInputStream fis = new FileInputStream(p.toFile());){
			int lido;
			while ((lido = fis.read()) != -1) {
				frequencia[lido]++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return frequencia;
	}
}
