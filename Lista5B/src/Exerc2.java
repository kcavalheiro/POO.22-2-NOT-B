import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exerc2 {

	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser(".");
		int opcao = jfc.showOpenDialog(null);
		if (opcao == JFileChooser.APPROVE_OPTION) {
			File arqSelecionado = jfc.getSelectedFile();
			try {
				FileReader leitura = new FileReader(arqSelecionado);
				String nomeSaida = arqSelecionado.getName()+"-saida";
				FileWriter gravacao = new FileWriter(nomeSaida);
				int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da chave (1-200):"));
				int lido = leitura.read();
				while (lido != -1) { // -1 significa que alcançou fim do arquivo
					gravacao.write(converte(lido, chave));
					lido = leitura.read();
				}

				leitura.close();
				gravacao.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

	private static int converte(int lido, int chave) {
		int novo = lido + chave;
		if (novo > 255) {
			novo = novo - 256;
		}
		// novo = novo % 256; // igual ao if anterior
		return novo;
	}

}
