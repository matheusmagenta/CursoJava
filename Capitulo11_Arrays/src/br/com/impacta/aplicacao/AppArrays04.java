package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArrays04 {
	public static void main(String[] args) {
	
		//o usuário fornece a quantidade de nomes
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos nomes?"));
		if(quantidade <= 0){
			JOptionPane.showMessageDialog(null, "Quantidade inválida", "Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		//um array é criado com a quantidade fornecida pelo usuário
		String[] nomes = new String[quantidade];
		
		//o usuário fornece um nome para cada posição do array. estrutura de repetição p captar valores
        for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Insira o nome:" + (i+1));
		}
		
		//o programa exibe todos os nomes fornecidos. estrutura de repetição p exibir valores
		System.out.println("LISTA COMPLETA DE NOMES:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		//o programa colocará os elementos em ordem, e os exibirá
		Arrays.sort(nomes);
		System.out.println("LISTA ORDENADA DE NOMES: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
}
}
