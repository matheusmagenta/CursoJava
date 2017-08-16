package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppLista01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		
		//adicionando elementos
		nomes.add("Caio");
		nomes.add("Helen");
		nomes.add("Gabi");
		nomes.add("Isabela");
		nomes.add("Patricia");
		nomes.add("Leticia");
		nomes.add("Max");
		
		// adicionar elemento na primeira posição
		nomes.add(0, "Isadora");
		
		//removendo o último elemento
		nomes.remove(nomes.size() - 1);
		
		//removendo um conjunto de nomes com base em uma condição
		// expressão lambda referencia um método que não está pronto ainda. vc só se preocupa com a operação. n precisa ter o método presente.
		nomes.removeIf(s -> s.startsWith("I"));
		
		//ordenando a lista de nomes
		Collections.sort(nomes);
		
		
		//exibindo os elemntos na tela		
		//1ª forma = loop for tradicional
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println("|---------------------------|");
		
		//2ª forma = loop for aprimorado (foreach) // nasceu no java 5
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("|---------------------------|");
		
		//3ª forma - expressão lambda
		nomes.forEach(s -> System.out.println(s));
		
		System.out.println("|---------------------------|");

		//4ª forma - exibindo a lista como está
		System.out.println(nomes);
		
		
		
		
		}         
}
