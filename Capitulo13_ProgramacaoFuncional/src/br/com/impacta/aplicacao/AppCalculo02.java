package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Calculo02;


public class AppCalculo02 {
	public static void main(String[] args) {
		Calculo02 calc1 = () -> System.out.println("Varias coisas");
		calc1.executar();
		
		Calculo02 calc2 = () -> {
			Pessoa p = new Pessoa("Ze", 30, Sexo.MASCULINO);
			JOptionPane.showMessageDialog(null, p.exibir());
			};
			calc2.executar();
}
	
}
 