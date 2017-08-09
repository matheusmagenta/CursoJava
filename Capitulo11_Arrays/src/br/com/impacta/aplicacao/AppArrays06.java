package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;
	
public class AppArrays06 {
	public static void main(String[] args) {
	
			String nome = JOptionPane.showInputDialog("Informe seu nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			
			Sexo sexo = (Sexo) JOptionPane.showInputDialog(null, 
													"Qual é o sexo?",
													"Seleção de sexo",
													JOptionPane.QUESTION_MESSAGE,
													null,
													Sexo.values(),
													null);
			
			Pessoa pessoa = new Pessoa(nome, idade, sexo);
}
}
