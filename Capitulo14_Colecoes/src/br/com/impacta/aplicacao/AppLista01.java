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
		
		// adicionar elemento na primeira posi��o
		nomes.add(0, "Isadora");
		
		//removendo o �ltimo elemento
		nomes.remove(nomes.size() - 1);
		
		//removendo um conjunto de nomes com base em uma condi��o
		// express�o lambda referencia um m�todo que n�o est� pronto ainda. vc s� se preocupa com a opera��o. n precisa ter o m�todo presente.
		nomes.removeIf(s -> s.startsWith("I"));
		
		//ordenando a lista de nomes
		Collections.sort(nomes);
		
		
		//exibindo os elemntos na tela		
		//1� forma = loop for tradicional
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println("|---------------------------|");
		
		//2� forma = loop for aprimorado (foreach) // nasceu no java 5
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("|---------------------------|");
		
		//3� forma - express�o lambda
		nomes.forEach(s -> System.out.println(s));
		
		System.out.println("|---------------------------|");

		//4� forma - exibindo a lista como est�
		System.out.println(nomes);
		
		
		
		
		}         
}
