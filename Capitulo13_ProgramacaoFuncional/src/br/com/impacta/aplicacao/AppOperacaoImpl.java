package br.com.impacta.aplicacao;

import br.com.impacta.classes.OperacaoImpl;
import br.com.impacta.interfaces.Operacao;

public class AppOperacaoImpl {
	public static void main(String[] args) {
		//Executando o método da interface Operacao: parte 1
		OperacaoImpl op1 = new OperacaoImpl();
		double valor1 = op1.executar(2, 3);
		System.out.println("valor1 = " + valor1);
		
		//Executando o método da interface Operacao: parte 2
		Operacao op2 = new OperacaoImpl();
		double valor2 = op2.executar(2, 3);
		System.out.println("valor2 = " + valor2);
		
		//E se desejarmos outras operações, além daquela definida
		//na classe? Seria necessário criar uma classe para cada
		//operação. 
		//Com a classe interna anônima, podemos evitar de criarmos
		//novos arquivos contendo novas classes, e em cada 
		//implementação anônima, podemos definir a operação que 
		//desejarmos.
		
		Operacao op3 = new Operacao() {
			
			@Override
			public double executar(double a, double b) {
				// Nesta implementação, retornaremos a soma dos parametros
				return a + b;
			}
		};		
		double valor3 = op3.executar(2, 3);
		System.out.println("valor3 = " + valor3);
		
		op3 = new Operacao() {
			
			@Override
			public double executar(double a, double b) {
				return a - b;
			}
		};
		
		double valor4 = op3.executar(2, 3);
		System.out.println("valor4 = " + valor4);
	}
}




