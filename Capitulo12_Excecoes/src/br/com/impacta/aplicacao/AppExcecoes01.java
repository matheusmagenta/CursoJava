package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;


//quem manda na execu��o do m�todo � o objeto.
//erro de l�gica � o mais dif�cil de encontrar.
//NullPointerException
public class AppExcecoes01 {
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
					"Exce��o",
					JOptionPane.ERROR_MESSAGE);
	} 	catch (NumberFormatException e){
		JOptionPane.showMessageDialog(null, 
					"Erro - convers�o: " + e.getMessage(),
					"Exce��o",
					JOptionPane.ERROR_MESSAGE);
		}
}
}

