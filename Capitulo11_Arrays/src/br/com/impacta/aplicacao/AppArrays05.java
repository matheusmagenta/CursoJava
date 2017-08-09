package br.com.impacta.aplicacao;

import java.util.Arrays;


import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppArrays05 {
	public static void main(String[] args) {
	
			Pessoa[] pessoas = new Pessoa[4];
			
			// quando cria array de objeto, tá criando array de referência. 
			// criar um array é diferente de criar objetos
			
			pessoas[0] = new Pessoa("Joao", 25, Sexo.MASCULINO);
			pessoas[1] = new Funcionario("Amanda", 30, Sexo.FEMININO, "12345678900", "secretaria", 4000);
			pessoas[2] = new Aluno("Bernardo", 40, Sexo.MASCULINO, 987, "PHP");
			pessoas[3] = new Funcionario("Joao", 20, Sexo.MASCULINO, "100987654321", "motorista", 15000);
			
			System.out.println("DADOS ORIGINAIS:\n");
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa.exibir());
				System.out.println("-----------------------------");
			}
			
			Arrays.sort(pessoas);
			
			System.out.println("DADOS ORDENADOS:\n");
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa.exibir());
				System.out.println("-----------------------------");
			}
}
}
