package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
   public static void main(String[] args) {
	   
	   Pessoa p1 = new Pessoa("Jefferson");
	   
	   Pessoa p2 = new Pessoa("Gerson", 30);
	   
	   Pessoa p3 = new Pessoa("Andreia", 18, Sexo.FEMININO);
	   
	   Pessoa p4 = new Pessoa("Luciana", 40, Sexo.FEMININO, new Endereco("Av.Paulista", 1009, "SP") );
	   
	   JOptionPane.showMessageDialog(null, p1.exibirPessoa());
	   JOptionPane.showMessageDialog(null, p2.exibirPessoa());
	   JOptionPane.showMessageDialog(null, p3.exibirPessoa());
	   JOptionPane.showMessageDialog(null, p4.exibirPessoa());
	     
	
   }
}
