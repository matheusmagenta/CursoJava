package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes03 {
	public static void main(String[] args) {
		try {
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		JOptionPane.showMessageDialog(null, "Nome informado: " + nome.toUpperCase());
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
		}
		
		catch (NullPointerException e){
		
		JOptionPane.showMessageDialog(null, 
					"Erro - ref. nula: " + e.getMessage(),
					"Exceção",
					JOptionPane.ERROR_MESSAGE);
	} 	catch (NumberFormatException e){
		JOptionPane.showMessageDialog(null, 
					"Erro - conversão: " + e.getMessage(),
					"Exceção",
					JOptionPane.ERROR_MESSAGE);
		}
		
	 	catch (Exception e){
		JOptionPane.showMessageDialog(null, 
					"Erro - conversão: " + e.getMessage(),
					"Exceção",
					JOptionPane.ERROR_MESSAGE);
		}
		//Na elaboração de vários blocos catch, as superclasses que representam
		//exceções devem ser colocadas por último. o erro pode ser exposto pelo
		//jvm ou pelo próprio método
}
}


