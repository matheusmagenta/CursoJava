package br.com.impacta.aplicacao;

import java.util.HashSet;
import java.util.Set;

//funciona como uma fila, não permite elemento duplicado e uma vez que você inseriu um elemento nele a ordem será mantida
		//é a coleção mais rápida que existe. se vc n tá preocupado com ordme, ele insere os elmentos num algoritmo sem sequência pq é mais rápido
		// é um algoritmo de complexidade O2
		// usa como base o código hash para garantir velocidade
		

public class AppSet01 {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		System.out.println(nomes.add("Caio"));
		System.out.println(nomes.add("Helen"));
		System.out.println(nomes.add("Gabi"));
		System.out.println(nomes.add("Isabela"));
		System.out.println(nomes.add("Isabela"));
		System.out.println(nomes.add("Patricia"));
		System.out.println(nomes.add("Leticia"));
		System.out.println(nomes.add("Max"));
		
		//para impedir repetição de elementos, essa coleção utiliza o retorno do método hashCode() e do método equals()
		//se os valores retornados por hashCode forem iguais, E o método equals() retornar true, então os elementos são
		//considerados iguais
		
		nomes.forEach(s -> System.out.println(s));
		System.out.println("|------------------------|");
		nomes.forEach(s -> System.out.println(s.hashCode())); //cada objeto tem um "cpf", uma identificação própria
	}
}
