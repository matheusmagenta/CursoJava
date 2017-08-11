package br.com.impacta.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.UIManager;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class CadastroPessoas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroPessoas frame = new CadastroPessoas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	//método com mesmo nome da classe é o construtor, deixando tudo pronto pra uso
	public CadastroPessoas() {
		setTitle("Cadastro de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlDadosPessoais = new JPanel();
		pnlDadosPessoais.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlDadosPessoais.setBounds(10, 11, 259, 190);
		contentPane.add(pnlDadosPessoais);
		pnlDadosPessoais.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(44, 25, 193, 20);
		pnlDadosPessoais.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 28, 46, 14);
		pnlDadosPessoais.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 69, 46, 14);
		pnlDadosPessoais.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(44, 66, 40, 20);
		pnlDadosPessoais.add(txtIdade);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 109, 46, 14);
		pnlDadosPessoais.add(lblSexo);
		
		JComboBox<Sexo> cmbSexo = new JComboBox<>();
		for (Sexo sexo : Sexo.values()) {
			cmbSexo.addItem(sexo);
		}
		cmbSexo.setBounds(44, 105, 140, 22);
		pnlDadosPessoais.add(cmbSexo);
		
		JButton btnIncluirDados = new JButton("Incluir");
		btnIncluirDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nome = txtNome.getText();
					int idade = Integer.parseInt(txtIdade.getText());
					Sexo sexo = (Sexo) cmbSexo.getSelectedItem();
					
					Pessoa pessoa = new Pessoa(nome, idade, sexo);
					
					JOptionPane.showMessageDialog(null, pessoa.exibir());
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		
	});
		btnIncluirDados.setBounds(10, 156, 91, 23);
		pnlDadosPessoais.add(btnIncluirDados);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(158, 156, 91, 23);
		pnlDadosPessoais.add(btnCancelar);
	}
}
