package br.com.impacta.aplicacao;

import java.util.HashSet;
import java.util.Set;

//funciona como uma fila, n�o permite elemento duplicado e uma vez que voc� inseriu um elemento nele a ordem ser� mantida
		//� a cole��o mais r�pida que existe. se vc n t� preocupado com ordme, ele insere os elmentos num algoritmo sem sequ�ncia pq � mais r�pido
		// � um algoritmo de complexidade O2
		// usa como base o c�digo hash para garantir velocidade
		

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
		
		//para impedir repeti��o de elementos, essa cole��o utiliza o retorno do m�todo hashCode() e do m�todo equals()
		//se os valores retornados por hashCode forem iguais, E o m�todo equals() retornar true, ent�o os elementos s�o
		//considerados iguais
		
		nomes.forEach(s -> System.out.println(s));
		System.out.println("|------------------------|");
		nomes.forEach(s -> System.out.println(s.hashCode())); //cada objeto tem um "cpf", uma identifica��o pr�pria
	}
}
