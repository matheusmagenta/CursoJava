package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Verificacao;

public class AppVerificacao {
	public static void main(String[] args) {
		
		Verificacao v = s  -> (s != null) && !s.equals("");
		
		System.out.println(v.verificar("java"));
		System.out.println(v.verificar(""));
		System.out.println(v.verificar(null));
		System.out.println("------------------------");
		
		v = s -> s != null;
		System.out.println(v.verificar("java"));
		System.out.println(v.verificar(""));
		System.out.println(v.verificar(null));		
	}
}
