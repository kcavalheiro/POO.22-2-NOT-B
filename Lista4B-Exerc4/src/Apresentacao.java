


import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Apresentacao extends javax.swing.JFrame {

	private Camara camara = new Camara();
	private Partido pesquisado;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private char combobox;
	
	
	public Apresentacao() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jtfNumPartido = new javax.swing.JTextField();
		jtfNomePartido = new javax.swing.JTextField();
		jbCadastrarPartido = new javax.swing.JButton();
		jbCadastrarPartido.setBackground(Color.CYAN);
		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jtfNomeVereador = new javax.swing.JTextField();
		jtfNumPartidoVereador = new javax.swing.JTextField();
		
		jtfNumPartidoVereador.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				int numPartido = Integer.parseInt(jtfNumPartidoVereador.getText());
				pesquisado = camara.getPartido(numPartido);
				String msg;
				
				if (pesquisado == null) {
					msg = "Número de partido não encontrado.";
					jbCadastrarVereador.setEnabled(false);
				} else {
					msg = "Partido " + pesquisado.getNome() + " encontrado.";
					jbCadastrarVereador.setEnabled(true);
				}
				JOptionPane.showMessageDialog(null, msg);
				jtfNomePartido.setText(msg);
			}
		});

		jlNomePartido = new javax.swing.JLabel();
		jbCadastrarVereador = new javax.swing.JButton();
		jbCadastrarVereador.setEnabled(false);
		jPanel3 = new javax.swing.JPanel();
		jbMenorDesempenho = new javax.swing.JButton();
		jbMenorDesempenho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				Vereador menorDesempenho = camara.getVereadorMenorDesemp();
				
				if (menorDesempenho == null) {
					msg = "Não há nenhum projeto apresentado ainda.";
				} else {
					msg = "Vereador com menor desempenho: " + menorDesempenho.getNome() + "\nSeu partido: " + menorDesempenho.getPartido().getNome() + 
							"\nSeu desempenho: " + menorDesempenho.getDesempenho();
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jbMaisProjetos = new javax.swing.JButton();
		jbMaisProjetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				Vereador maiorDesempenho = camara.getVereadorMaisProjAprov();
				
				if (maiorDesempenho != null) {
					msg = "Vereador com maior desempenho: " + maiorDesempenho.getNome() + "\nSeu partido: " + maiorDesempenho.getPartido().getNome() + 
							"\nSeu desempenho: " + maiorDesempenho.getDesempenho();
				} else {
					msg = "Ainda não existem projetos aprovados.";
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jLabel9 = new javax.swing.JLabel();
		jtfNumPartidoConsulta = new javax.swing.JTextField();
		jbEstatisticas = new javax.swing.JButton();
		jbEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numPartido = Integer.parseInt(jtfNumPartidoConsulta.getText());
				pesquisado = camara.getPartido(numPartido);
				String msg = "";
				
				if (pesquisado != null) {
					msg = "Nome do partido: " + pesquisado.getNome() + "\nMédia de desempenho: " + pesquisado.getMediaDesempenho() 
						  + "\nQuantidade de projetos apresentados: " + pesquisado.getTotalProjetosApresentados() + "\nQuantidade de projetos aprovados: " +
						  pesquisado.getTotalProjetosAprovados() + "\nQuantidade de vereadores: " + pesquisado.getQtdeVereadores();
				} else {
					msg = "Número de partido não encontrado.";
				}
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		jSeparator1 = new javax.swing.JSeparator();
		jbTotalProjetos = new javax.swing.JButton();
		jbVereadoresAcimaMedia = new javax.swing.JButton();

		jLabel7.setText("jLabel7");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lista 3 - Exercício 5");

		jLabel1.setText("Número:");

		jLabel2.setText("Nome:");

		jbCadastrarPartido.setText("Cadastrar");
		jbCadastrarPartido.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jbCadastrarPartido)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jtfNomePartido, javax.swing.GroupLayout.PREFERRED_SIZE,
														177, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(153, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(jtfNumPartido, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jtfNomePartido,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jbCadastrarPartido).addContainerGap(139, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Partido", jPanel1);

		jLabel3.setText("Nome: ");

		jLabel4.setText("Número do partido:");

		jbCadastrarVereador.setText("Cadastrar");
		jbCadastrarVereador.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jtfNomeVereador, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addGap(132)
							.addComponent(jbCadastrarVereador))
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(jLabel4)
							.addGap(20)
							.addComponent(jtfNumPartidoVereador, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(jlNomePartido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(19)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3)
						.addComponent(jtfNomeVereador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel4)
						.addComponent(jtfNumPartidoVereador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlNomePartido, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
					.addGap(106)
					.addComponent(jbCadastrarVereador)
					.addGap(70))
		);
		jPanel2.setLayout(jPanel2Layout);

		jTabbedPane1.addTab("Vereador", jPanel2);

		jbMenorDesempenho.setText("Vereador menor desempenho");

		jbMaisProjetos.setText("Vereador com mais proj. aprovados");

		jLabel9.setText("Número do partido:");

		jbEstatisticas.setText("Estatísticas do partido");

		jbTotalProjetos.setText("Total de projetos da Câmara");
		jbTotalProjetos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jbVereadoresAcimaMedia.setText("Vereadores acima da média");
		jbVereadoresAcimaMedia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		
		
		JPanel panel = new JPanel();
		jTabbedPane1.addTab("Projetos de Lei", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vereador:");
		lblNewLabel.setBounds(10, 10, 96, 13);
		panel.add(lblNewLabel);
		
		
		
		JComboBox comboBoxTpProj = new JComboBox();
		comboBoxTpProj.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				combobox = comboBoxTpProj.getSelectedItem().toString().charAt(0);
				
				if (combobox == 'P') {
					tfArtigoLO.setEditable(false);
					tfVotos.setEditable(false);
					tfArtigoLO.setText("");
					tfVotos.setText("");
				} else if (combobox == 'C') {
					tfArtigoLO.setEditable(true);
					tfVotos.setEditable(true);
				}
			}
		});
		comboBoxTpProj.setModel(new DefaultComboBoxModel(new String[] {"Projeto de Lei", "Complementar"}));
		comboBoxTpProj.setBounds(177, 31, 188, 21);
		panel.add(comboBoxTpProj);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo do projeto:");
		lblNewLabel_2.setBounds(10, 35, 100, 13);
		panel.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(174, 245, 0, -153);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 58, 355, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Titulo do Projeto:");
		lblNewLabel_3.setBounds(10, 70, 96, 21);
		panel.add(lblNewLabel_3);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(177, 63, 188, 29);
		panel.add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Apresenta\u00E7\u00E3o:");
		lblNewLabel_4.setBounds(10, 108, 164, 21);
		panel.add(lblNewLabel_4);
		
		tfDtApres = new JTextField();
		tfDtApres.setBounds(177, 105, 188, 27);
		panel.add(tfDtApres);
		tfDtApres.setColumns(10);
		
		tfDtAprov = new JTextField();
		tfDtAprov.setBounds(177, 143, 188, 27);
		panel.add(tfDtAprov);
		tfDtAprov.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Data de Aprova\u00E7\u00E3o:");
		lblNewLabel_5.setBounds(10, 150, 164, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Artigo Lei Org\u00E2nica:");
		lblNewLabel_6.setBounds(10, 184, 164, 21);
		panel.add(lblNewLabel_6);
		
		tfArtigoLO = new JTextField();
		tfArtigoLO.setEditable(false);
		tfArtigoLO.setBounds(177, 181, 188, 27);
		panel.add(tfArtigoLO);
		tfArtigoLO.setColumns(10);
		
		tfVotos = new JTextField();
		tfVotos.setEditable(false);
		tfVotos.setBounds(177, 219, 188, 27);
		panel.add(tfVotos);
		tfVotos.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Votos favor\u00E1veis:");
		lblNewLabel_7.setBounds(10, 224, 164, 17);
		panel.add(lblNewLabel_7);
		
		comboNomeV = new JComboBox();
		comboNomeV.setBounds(177, 6, 188, 21);
		panel.add(comboNomeV);
		
		JButton btnProjetoLei = new JButton("Adicionar Projeto");
		btnProjetoLei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int index_combo = comboBoxTpProj.getSelectedIndex();
					Vereador vereador = (Vereador) comboNomeV.getSelectedItem();
					LocalDate dataAprov = null;
					if (!tfDtAprov.getText().isBlank()) {
						dataAprov = LocalDate.parse(tfDtAprov.getText(), formatador);
					}
					ProjetoDeLei lei;
					if(index_combo == 0) {
						 lei = new ProjetoDeLei(tfTitulo.getText(), LocalDate.parse(tfDtApres.getText(), formatador), 
								dataAprov);
					}else {
						lei = new ProjetoDeLeiComplementar(tfTitulo.getText(), LocalDate.parse(tfDtApres.getText(), formatador),
								dataAprov, Integer.parseInt(tfArtigoLO.getText()), Integer.parseInt(tfVotos.getText()));
					}
					vereador.addProjetoDeLei(lei);
					JOptionPane.showMessageDialog(null, "Projeto adicionado com sucesso");

				}catch(DateTimeParseException dt) {
					JOptionPane.showMessageDialog(null, "Insira uma data válida.");
				}catch(NumberFormatException nf) {
					JOptionPane.showMessageDialog(null, "Insira um número válido");
				}catch (IllegalArgumentException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}

			}
		});
		btnProjetoLei.setBounds(110, 253, 151, 23);
		panel.add(btnProjetoLei);
		
		btnVereadoresProjetos = new JButton("Dados individuais dos veradores");
		btnVereadoresProjetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String partido = "";
				String vereador = "";
				String projeto = "";
				for(Partido p: camara.getTodosOsPartidos().values()) {
					partido += "Partido: " + p.getNome();
					for(Vereador v: p.getVereadores()) {
						vereador += "\n Vereador: " + v.getNome() + "\n Desempenho: " + v.getDesempenho() + "\n\n Projetos: ";
						for(ProjetoDeLei proj: v.getProjetoDeLei()) {
							projeto += "\n" + proj.mostrar() + "\n";
						}
						JOptionPane.showMessageDialog(null, partido + vereador + projeto);
						vereador = "";
						projeto = "";
					}
					partido = "";
				}
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel3Layout.createSequentialGroup()
									.addComponent(jLabel9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(jtfNumPartidoConsulta, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(jbEstatisticas))))
						.addComponent(jbMenorDesempenho)
						.addComponent(jbMaisProjetos)
						.addComponent(jbTotalProjetos)
						.addComponent(jbVereadoresAcimaMedia)
						.addComponent(btnVereadoresProjetos))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel9)
						.addComponent(jtfNumPartidoConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbEstatisticas))
					.addGap(13)
					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jbMenorDesempenho)
					.addGap(18)
					.addComponent(jbMaisProjetos)
					.addGap(18)
					.addComponent(jbTotalProjetos)
					.addGap(18)
					.addComponent(jbVereadoresAcimaMedia)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnVereadoresProjetos)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

		jTabbedPane1.addTab("Consultas", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(layout);

		pack();
	}


	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Partido partido = new Partido(jtfNomePartido.getText(), Integer.parseInt(jtfNumPartido.getText()), null);
		String msg = "";
		
		partido.setNome(jtfNomePartido.getText());
		if (!(Integer.parseInt(jtfNumPartido.getText()) >= 10 && Integer.parseInt(jtfNumPartido.getText()) < 100)) {
			msg = "O número do partido deve ser maior que 9 e menor que 100.";
		} else {
			partido.setNumero(Integer.parseInt(jtfNumPartido.getText()));
			msg = "Cadastrado com sucesso!";
		}
		camara.addPartido(partido);
		JOptionPane.showMessageDialog(null, msg);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		Vereador vereador = new Vereador(jtfNomeVereador.getText());
		pesquisado.addVereador(vereador);
		comboNomeV.addItem(vereador);
		JOptionPane.showMessageDialog(null, "Vereador cadastrado com sucesso!");
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		int totalProjApres = camara.getTotalProjApres();
		int totalProjAprov = camara.getTotalProjAprov();
		String msg = "<< Câmara >>" + "\nTotal projetos apresentados: " + totalProjApres + "\nTotal projetos aprovados: " + totalProjAprov;
		
		JOptionPane.showMessageDialog(null, msg);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = "Média da Câmara: " + camara.getDesempMedio();
		
		ArrayList<Vereador> listaAcimaMedia = camara.getVereadoresAcimaMedia();
		for (Vereador v : listaAcimaMedia) {
			msg += "\nVereadores com média acima: " + "\nVereador: " + v.getNome() + "\nPartido: " + v.getPartido().getNome() +
					"\nDesempenho: " + v.getDesempenho();
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Apresentacao.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Apresentacao().setVisible(true);
			}
		});
	}

	// Variables declaration
	private javax.swing.JButton jbCadastrarPartido;
	private javax.swing.JButton jbCadastrarVereador;
	private javax.swing.JButton jbMenorDesempenho;
	private javax.swing.JButton jbMaisProjetos;
	private javax.swing.JButton jbEstatisticas;
	private javax.swing.JButton jbTotalProjetos;
	private javax.swing.JButton jbVereadoresAcimaMedia;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jlNomePartido;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jtfNumPartido;
	private javax.swing.JTextField jtfNomePartido;
	private javax.swing.JTextField jtfNomeVereador;
	private javax.swing.JTextField jtfNumPartidoVereador;
	private javax.swing.JTextField jtfNumPartidoConsulta;
	private javax.swing.JComboBox comboNomeV;
	private JTextField tfTitulo;
	private JTextField tfDtApres;
	private JTextField tfDtAprov;
	private JTextField tfArtigoLO;
	private JTextField tfVotos;
	private JButton btnVereadoresProjetos;
}