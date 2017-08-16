package br.com.impacta.aplicacao;

import br.com.impacta.classes.Aluno;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Calculo03;

public class AppCalculo03 {
	public static void main(String[] args) {
		
		// String executar(T elemento); 
		// o retorno � string sempre, para todos os casos. mas o par�metro � gen�rico. s� para essa vari�vel o T vale string. 
		// na hora em que declararmos, o t assume essa parametriza��o. 
		// o <T> � como se fosse um valor em branco, uma lacuna a ser preenchida. s� vai saber na hora de declarar a vari�vel, de usar a interface.
		
		Calculo03<String> calc1 = s -> s.toUpperCase();
		System.out.println(calc1.executar("T vale String:"));
		
		Calculo03<Aluno> calc2 = s -> s.exibir();
		Aluno aluno = new Aluno ("Max", 58, Sexo.OUTROS, 1000, "Teologia");
		
		System.out.println(calc2.executar(aluno));
		
		
		
	}
}
