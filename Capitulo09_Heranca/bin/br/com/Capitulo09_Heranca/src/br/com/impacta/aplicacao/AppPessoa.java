package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
   public static void main(String[] args) {
	   
	 
	   Pessoa p4 = new Pessoa("Marcos", 44, Sexo.MASCULINO, new Endereco("Av.Paulista", 1009, "SP") );
	   
	   Pessoa p5 = new Pessoa("Luciana", 40, Sexo.FEMININO, new Endereco("Av.Paulista", 1009, "SP") );
	   
	   JOptionPane.showMessageDialog(null, p4.exibir());
	   JOptionPane.showMessageDialog(null, p5.exibir());  
	
   }
}
