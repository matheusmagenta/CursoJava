package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa("Osvaldo", -40, Sexo.MASCULINO, new Endereco("Avenida Paulista", 1009, "São Paulo"));
		
//		Pessoa pessoa = new Pessoa("joão", 40, Sexo.MASCULINO, "avenida");
//		
//		JOptionPane.showMessageDialog(null, pessoa.exibir());	
	
		//como o construtor d efuncionar lanca uma exceção verificada, 
		//quem o chamar também dverá lançar a mesma exceção, ou sua
		//chamada deve ser incluída em um bloco try/catch 
		
		
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			// método para colocar a mensagem no formato do sistema operacional
			
			Funcionario funcionario = new Funcionario("Douglas", "12345678900", "assistente", 400);
			JOptionPane.showMessageDialog(null, funcionario.exibir());
			
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "erro: " + e.getMessage(), "exceção", JOptionPane.ERROR_MESSAGE);
		
			e.getStackTrace();
			}
		
	}
	 
}
