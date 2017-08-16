package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Calculo01;

public class AppCalculo01 {
	public static void main(String[] args) {
		Calculo01 calc1 = (x, s) -> s.substring(x);
		System.out.println(calc1.calcular(3, "Programa"));
		
		Calculo01 calc2 = (x, s) -> { 
			String s1 = s.replace(" ", "");
			return s1.substring(x);
		};
		
		System.out.println(calc2.calcular(3, "O uso de lambda"));
				
	}
}
