package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.impacta.classes.*;
import br.com.impacta.enumeracoes.Sexo;

public class AppLista02 {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		try {
			pessoas.add(new Pessoa("Jonas", 50, Sexo.MASCULINO));
			pessoas.add(new Funcionario("Emilio", 47, Sexo.MASCULINO,"00123456789", "Assistente", 5000));
			pessoas.add(new Aluno("Caio", 23, Sexo.MASCULINO, 100, "TI"));
			//ordenando pessoas: a classe Pessoa deve implementar Comparable
			
			Collections.sort(pessoas);
		
			for (Pessoa pessoa : pessoas) {
				System.out.println(pessoa);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
