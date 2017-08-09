package br.com.impacta.aplicacao;

import br.com.impacta.classes.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args){
//		//metodo somarExtremos()
		int[] numeros = {15, 10, 8, 7, 9};
		System.out.println(Utilitarios.somarExtremos(numeros));

		//metodo buscarMaior()
		double[] valores = {19.8, 19.4, 7.5, 20.0, 16};
			System.out.println(Utilitarios.buscarMaior(valores));
		
		//metodo somarElementos
		int soma1 = Utilitarios.somarElementos(numeros);
		int soma2 = Utilitarios.somarElementos(2, 3);
		int soma3 = Utilitarios.somarElementos(2, 3, 6, 8, 9);
		int soma4 = Utilitarios.somarElementos(-10);
		
		System.out.println("soma 1 = " + soma1);
		System.out.println("soma 2 = " + soma2);
		System.out.println("soma 3 = " + soma3);
		System.out.println("soma 4 = " + soma4);
	}
}

