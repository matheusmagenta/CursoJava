package br.com.impacta.aplicacao;

public class AppArraysBidimensionais01 {
	public static void main(String[] args) {
		int [][] matriz = new int [4][3];
		
		matriz[0][0] = 2;
		matriz[0][1] = 5;
		matriz[0][2] = 8;
		
		matriz[1][0] = 10;
		matriz[1][1] = -1;
		matriz[1][2] = 4;
		
		matriz[2][0] = -7;
		matriz[2][1] = 18;
		matriz[2][2] = 20;
		
		matriz[3][0] = 16;
		matriz[3][1] = 11;
		matriz[3][2] = 14;
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
}
