import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exerc1 {

	public static void main(String[] args) {
		try {
			// gravação do arquivo texto
			FileWriter fw = new FileWriter("TextoExerc1.txt");
			fw.write("12345");
			fw.close();
			
			// gravação do arquivo binário
			FileOutputStream fos = new FileOutputStream("BinarioExerc1.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(12345);
			dos.close();
			
			// leitura como texto de ambos os arquivos
			FileReader fr1 = new FileReader("TextoExerc1.txt");
			BufferedReader bf1 = new BufferedReader(fr1);
			String lido = bf1.readLine();
			System.out.println("Lido texto de texto = "+lido);
			bf1.close();
			
			FileReader fr2 = new FileReader("BinarioExerc1.dat");
			BufferedReader bf2 = new BufferedReader(fr2);
			lido = bf2.readLine();
			System.out.println("Lido texto de binário = "+lido);
			bf2.close();
			
			
			// leitura como binário de ambos os arquivos
			FileInputStream fis1 = new FileInputStream("TextoExerc1.txt");
			DataInputStream dis1 = new DataInputStream(fis1);
			int intLido = dis1.readInt();
			System.out.println("Lido binário de texto = "+intLido);
			dis1.close();

			FileInputStream fis2 = new FileInputStream("BinarioExerc1.dat");
			DataInputStream dis2 = new DataInputStream(fis2);
			intLido = dis2.readInt();
			System.out.println("Lido binário de binário = "+intLido);
			dis2.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
