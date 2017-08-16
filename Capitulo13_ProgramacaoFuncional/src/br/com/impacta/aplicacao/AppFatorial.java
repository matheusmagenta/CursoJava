package br.com.impacta.aplicacao;

import br.com.impacta.classes.Utilitarios;
import br.com.impacta.interfaces.Fatorial;

public class AppFatorial {

	public static void main(String[] args) {
		
		// o m�todo da nossa interface est� referenciando esse m�todo est�tico. isso s� � poss�vel se a defini��o
		// do m�otod que voc� est� referenciado for compat�vel. � uma fun�a� referenciando outra
		Fatorial fat = Utilitarios::calcularFatorial;
		int resultado = fat.calcular(5);
		System.out.println("resultado = " + resultado);
		
	}

}
