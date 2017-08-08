package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;

public class AppFuncionarios {
	public static void main(String[] args) {
		
		//funcionario generalizado
		Funcionario funcionario1 = new Funcionario("Paulo");
		funcionario1.setCpf("02565519523");
		funcionario1.setCargo("Assistente");
		funcionario1.setSalario(1000);
		
		JOptionPane.showMessageDialog(null, funcionario1.exibir());
			
	}	 	
	
}
