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
					"Exce��o",
					JOptionPane.ERROR_MESSAGE);
	} 	catch (NumberFormatException e){
		JOptionPane.showMessageDialog(null, 
					"Erro - convers�o: " + e.getMessage(),
					"Exce��o",
					JOptionPane.ERROR_MESSAGE);
		}
		
	 	catch (Exception e){
		JOptionPane.showMessageDialog(null, 
					"Erro - convers�o: " + e.getMessage(),
					"Exce��o",
					JOptionPane.ERROR_MESSAGE);
		}
		//Na elabora��o de v�rios blocos catch, as superclasses que representam
		//exce��es devem ser colocadas por �ltimo. o erro pode ser exposto pelo
		//jvm ou pelo pr�prio m�todo
}
}


