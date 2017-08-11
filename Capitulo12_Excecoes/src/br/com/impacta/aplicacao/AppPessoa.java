package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa("Osvaldo", -40, Sexo.MASCULINO, new Endereco("Avenida Paulista", 1009, "S�o Paulo"));
		
//		Pessoa pessoa = new Pessoa("jo�o", 40, Sexo.MASCULINO, "avenida");
//		
//		JOptionPane.showMessageDialog(null, pessoa.exibir());	
	
		//como o construtor d efuncionar lanca uma exce��o verificada, 
		//quem o chamar tamb�m dver� lan�ar a mesma exce��o, ou sua
		//chamada deve ser inclu�da em um bloco try/catch 
		
		
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			// m�todo para colocar a mensagem no formato do sistema operacional
			
			Funcionario funcionario = new Funcionario("Douglas", "12345678900", "assistente", 400);
			JOptionPane.showMessageDialog(null, funcionario.exibir());
			
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "erro: " + e.getMessage(), "exce��o", JOptionPane.ERROR_MESSAGE);
		
			e.getStackTrace();
			}
		
	}
	 
}
