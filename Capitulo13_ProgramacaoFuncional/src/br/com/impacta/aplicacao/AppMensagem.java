package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Mensagem;

public class AppMensagem {
	public static void main(String[] args) {
		
		Mensagem msg = s -> s.toUpperCase();
		System.out.println(msg.mostrar("java programmer"));
		
		msg = s -> JOptionPane.showInputDialog(s);		
		System.out.println(msg.mostrar("Informe alguma coisa"));
		
		//referenciando o métoxo exibir(String) da classe Pessoa
		// vc vinculou o objeto ao método exibir
		Pessoa p = new Pessoa("Matheus", 29, Sexo.MASCULINO);
		Mensagem mensagem = p::exibir;
		JOptionPane.showMessageDialog(null, mensagem.mostrar("INTERFACE FUNCIONAL"));
		
		
				
	}
}
