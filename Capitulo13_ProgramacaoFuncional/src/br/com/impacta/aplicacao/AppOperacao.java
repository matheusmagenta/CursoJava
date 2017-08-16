package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Operacao;

public class AppOperacao {
	public static void main(String[] args) {
		
		Operacao op1 = (a, b) -> a + b; //expressão lambda
		Operacao op2 = (x, y) -> (x > y) ? x : y;
		
		double valor1 = op1.executar(4, 6);
		System.out.println("valor1 = " + valor1);
		
		double valor2 = op2.executar(4, 6);
		System.out.println("valor2 = " + valor2);
		
	}
}
