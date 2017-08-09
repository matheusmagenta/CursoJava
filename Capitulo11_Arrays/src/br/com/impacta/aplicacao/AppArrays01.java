package br.com.impacta.aplicacao;

public class AppArrays01 {
	public static void main(String[] args) {
		
		int [] numeros = new int[5];
		
		numeros[1] = 120;
		numeros[2] = 10;
		numeros[4] = 16;
		
		for (int i= 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
        }
	}
}
