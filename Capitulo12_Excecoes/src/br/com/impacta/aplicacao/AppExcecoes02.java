package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;


//quem manda na execução do método é o objeto.
//erro de lógica é o mais difícil de encontrar.
//NullPointerException
public class AppExcecoes02 {
	public static void main(String[] args) {
		try {
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		JOptionPane.showMessageDialog(null, "Nome informado: " + nome.toUpperCase());
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		JOptionPane.showMessageDialog(null, "Idade informada: " + idade);
		}
		
		catch (NullPointerException | NumberFormatException e) { //Java7 em diante
		
		JOptionPane.showMessageDialog(null, 
					"Erro: " + e.getMessage(),
					"Exceção",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
