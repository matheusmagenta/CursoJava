package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArrays04 {
	public static void main(String[] args) {
	
		//o usu�rio fornece a quantidade de nomes
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos nomes?"));
		if(quantidade <= 0){
			JOptionPane.showMessageDialog(null, "Quantidade inv�lida", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		//um array � criado com a quantidade fornecida pelo usu�rio
		String[] nomes = new String[quantidade];
		
		//o usu�rio fornece um nome para cada posi��o do array. estrutura de repeti��o p captar valores
        for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Insira o nome:" + (i+1));
		}
		
		//o programa exibe todos os nomes fornecidos. estrutura de repeti��o p exibir valores
		System.out.println("LISTA COMPLETA DE NOMES:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		//o programa colocar� os elementos em ordem, e os exibir�
		Arrays.sort(nomes);
		System.out.println("LISTA ORDENADA DE NOMES: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
}
}
