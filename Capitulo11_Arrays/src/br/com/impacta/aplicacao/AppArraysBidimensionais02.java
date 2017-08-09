package br.com.impacta.aplicacao;

public class AppArraysBidimensionais02 {
	public static void main(String[] args) {
		int [][] matriz = new int[4][];
		
		int [] array01 = {2,5,8};
		int [] array02 = {3,7};
		int [] array03 = {10};
		int [] array04 = {8, 5, 6, 13};
		
		matriz[0] = array01;
		matriz[1] = array02;
		matriz[2] = array03;
		matriz[3] = array04;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
				System.out.println();
		}		
	
	
	
	}
}
