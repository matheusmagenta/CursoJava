package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
	
		Pessoa pessoa1 = new Pessoa();
		pessoa1.atribuirDados("Matheus", 31, Sexo.MASCULINO);
		//pessoa1.mostrarDados();
		
		JOptionPane.showMessageDialog(null, pessoa1.exibirPessoa());
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Jefferson");
		p1.setIdade(-10);
		p1.setSexo(Sexo.MASCULINO);
		
		JOptionPane.showMessageDialog(null, p1.exibirPessoa());
		
	
		
	}
}
