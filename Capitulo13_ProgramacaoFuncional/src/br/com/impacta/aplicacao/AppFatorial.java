package br.com.impacta.aplicacao;

import br.com.impacta.classes.Utilitarios;
import br.com.impacta.interfaces.Fatorial;

public class AppFatorial {

	public static void main(String[] args) {
		
		// o método da nossa interface está referenciando esse método estático. isso só é possível se a definição
		// do méotod que vocÊ está referenciado for compatível. é uma funçaõ referenciando outra
		Fatorial fat = Utilitarios::calcularFatorial;
		int resultado = fat.calcular(5);
		System.out.println("resultado = " + resultado);
		
	}

}
