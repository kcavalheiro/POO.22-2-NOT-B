import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfUF;
	private JTextField tfRenda;
	private JLabel lblNewLabel_4;
	private JTextField tfConsulta;
	private JButton btnNewButton_1;
	private JTextField tfCPFConsulta;
	// para exemplificar o uso de ambas as estruturas de dados. O comum é utilizar apenas a mais adequada ao problema.
	private ArrayList<Contribuinte> contribuintes = new ArrayList<>();
	private HashMap<String, Contribuinte> contribHash = new HashMap<>();
	private JButton btnParticipacaoHash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 11, 133, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfNome = new JTextField();
		tfNome.setBounds(122, 8, 237, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(122, 33, 86, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Estado (UF):");
		lblNewLabel_2.setBounds(10, 61, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfUF = new JTextField();
		tfUF.setBounds(122, 58, 46, 20);
		frame.getContentPane().add(tfUF);
		tfUF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Renda anual: R$");
		lblNewLabel_3.setBounds(10, 86, 99, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tfRenda = new JTextField();
		tfRenda.setBounds(122, 89, 86, 20);
		frame.getContentPane().add(tfRenda);
		tfRenda.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte c;
				c = new Contribuinte();
				c.setNome(tfNome.getText());
				c.setCpf(tfCPF.getText());
				c.setUf(tfUF.getText());
				c.setRendaAnual(Double.parseDouble(tfRenda.getText()));
				double imposto = c.getImposto();
				String s = "O contribuinte "+c.getNome()
							+ " CPF:"+c.getCpf()
							+ " irá pagar de imposto R$"+imposto;
				JOptionPane.showMessageDialog(frame, s);
				// guardando no ArrayList
				contribuintes.add(c);
				// guardando no HashMap
				contribHash.put(c.getCpf(), c);
			}
		});
		btnNewButton.setBounds(182, 120, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("Valor do imposto a consultar: R$");
		lblNewLabel_4.setBounds(10, 208, 198, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfConsulta = new JTextField();
		tfConsulta.setBounds(185, 205, 86, 20);
		frame.getContentPane().add(tfConsulta);
		tfConsulta.setColumns(10);
		
		btnNewButton_1 = new JButton("OK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorConsulta = Double.parseDouble(tfConsulta.getText());
				Contribuinte c;
				String str;
				// percorrendo o ArrayList de maneira numérica
				for (int i=0; i < contribuintes.size(); i++) {
					c = contribuintes.get(i);
					if (c.getImposto() > valorConsulta) {
						str = "O contribuinte "+c.getNome()
						+ " CPF:"+c.getCpf()
						+ " paga de imposto R$"+c.getImposto();
						JOptionPane.showMessageDialog(frame, str);
					}
				}
			}
		});
		btnNewButton_1.setBounds(286, 204, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("CPF a consultar:");
		lblNewLabel_5.setBounds(10, 233, 158, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tfCPFConsulta = new JTextField();
		tfCPFConsulta.setBounds(185, 233, 86, 20);
		frame.getContentPane().add(tfCPFConsulta);
		tfCPFConsulta.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str;
				// percorrendo o ArrayList com for-each
				for (Contribuinte c: contribuintes) {
					if (c.getCpf().equals(tfCPFConsulta.getText())) {
						str = "AL:O contribuinte "+c.getNome()
						+ " CPF:"+c.getCpf()
						+ " paga de imposto R$"+c.getImposto();
						JOptionPane.showMessageDialog(frame, str);
						break;
					}
				}
				

				Contribuinte c = contribHash.get(tfCPFConsulta.getText());
				if (c != null) { // achou 
					str = "HM:O contribuinte "+c.getNome()
					+ " CPF:"+c.getCpf()
					+ " paga de imposto R$"+c.getImposto();
				}
				else { // não achou
					str = "CPF não encontrado";
				}
				JOptionPane.showMessageDialog(frame, str);
			}
		});
		btnConsultar.setBounds(286, 229, 89, 23);
		frame.getContentPane().add(btnConsultar);
		
		JButton btnParticipacao = new JButton("Participa\u00E7\u00E3o %");
		btnParticipacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double impostoSC, impostoPR, impostoRS, impostoTotal;
				impostoSC=impostoPR=impostoRS=impostoTotal=0;
				
				for (Contribuinte c: contribuintes) {
					if (c.getUf().equals("SC")) {
						impostoSC += c.getImposto();
					}
					else if (c.getUf().equals("PR")) {
						impostoPR += c.getImposto();
					}
					else if (c.getUf().equals("RS")) {
						impostoRS += c.getImposto();
					}
					impostoTotal += c.getImposto();
				}
				
				String str = "Participação % de cada estado\n";
				str += "\n SC="+impostoSC+" = "+(impostoSC/impostoTotal*100)+"%";
				str += "\n PR="+impostoPR+" = "+(impostoPR/impostoTotal*100)+"%";
				str += "\n RS="+impostoRS+" = "+(impostoRS/impostoTotal*100)+"%";
				str += "\n Total="+impostoTotal;
				JOptionPane.showMessageDialog(frame, str);

			}
		});
		btnParticipacao.setBounds(286, 170, 120, 23);
		frame.getContentPane().add(btnParticipacao);
		
		btnParticipacaoHash = new JButton("% Hash");
		btnParticipacaoHash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double impostoTotal=0;
				HashMap<String,Double> impostos = new HashMap<>();
				for (Contribuinte c: contribuintes) {
					double valor = 0;
					if (impostos.containsKey(c.getUf())) {
						valor = impostos.get(c.getUf());
					}
					valor += c.getImposto();
					impostos.put(c.getUf(), valor);
					impostoTotal += c.getImposto();
				}
				
				String str = "Participação % de cada estado\n";
				for (String uf: impostos.keySet()) {
					double valor = impostos.get(uf);
					str += "\n"+uf+"="+valor+" = "+(valor/impostoTotal*100)+"%";
				}
				str += "\n Total="+impostoTotal;
				JOptionPane.showMessageDialog(frame, str);
			}
		});
		btnParticipacaoHash.setBounds(286, 141, 89, 23);
		frame.getContentPane().add(btnParticipacaoHash);
	}
}

