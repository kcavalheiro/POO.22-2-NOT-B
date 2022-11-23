import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exerc4 {

	public static void main(String[] parametros) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/y");
		// try-with-resources
		try (FileInputStream fis = new FileInputStream("DadosMeteorologicos-OK - 15 dias de Outubro.dat");
			 DataInputStream dis = new DataInputStream(fis);
			 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Objetos.obj"))){
			
			while (true) {
				String data = dis.readUTF();
				char c1 = dis.readChar();
				char c2 = dis.readChar();
				int veloc = dis.readInt();
				int indice = dis.readInt();
				double temperatura = dis.readDouble();
				ClimaDoDia cd = new ClimaDoDia(LocalDate.parse(data, df), c1 + "" + c2, veloc, indice, temperatura);
				System.out.println(cd);
				oos.writeObject(cd);
			}
			
		} catch (EOFException eof) {
			System.out.println("Acabou o arquivo");
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
