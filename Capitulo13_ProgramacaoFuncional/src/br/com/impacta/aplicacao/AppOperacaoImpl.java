package br.com.impacta.aplicacao;

import br.com.impacta.classes.OperacaoImpl;
import br.com.impacta.interfaces.Operacao;

public class AppOperacaoImpl {
	public static void main(String[] args) {
		//Executando o m�todo da interface Operacao: parte 1
		OperacaoImpl op1 = new OperacaoImpl();
		double valor1 = op1.executar(2, 3);
		System.out.println("valor1 = " + valor1);
		
		//Executando o m�todo da interface Operacao: parte 2
		Operacao op2 = new OperacaoImpl();
		double valor2 = op2.executar(2, 3);
		System.out.println("valor2 = " + valor2);
		
		//E se desejarmos outras opera��es, al�m daquela definida
		//na classe? Seria necess�rio criar uma classe para cada
		//opera��o. 
		//Com a classe interna an�nima, podemos evitar de criarmos
		//novos arquivos contendo novas classes, e em cada 
		//implementa��o an�nima, podemos definir a opera��o que 
		//desejarmos.
		
		Operacao op3 = new Operacao() {
			
			@Override
			public double executar(double a, double b) {
				// Nesta implementa��o, retornaremos a soma dos parametros
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




