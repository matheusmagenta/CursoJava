package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;


//quem manda na execução do método é o objeto.
//erro de lógica é o mais difícil de encontrar.
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
					"Exceção",
					JOptionPane.ERROR_MESSAGE);
	} 	catch (NumberFormatException e){
		JOptionPane.showMessageDialog(null, 
					"Erro - conversão: " + e.getMessage(),
					"Exceção",
					JOptionPane.ERROR_MESSAGE);
		}
}
}

