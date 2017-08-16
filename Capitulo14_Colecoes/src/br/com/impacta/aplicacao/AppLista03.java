package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.impacta.classes.*;

public class AppLista03 {
	public static void main(String[] args) {
	List<Endereco> enderecos = new ArrayList<>();
	
	enderecos.add(new Endereco("Avenida Rio Branco", 1000, "São Paulo"));
	enderecos.add(new Endereco("Avenida Paulista", 112321, "São Paulo"));
	enderecos.add(new Endereco("Rua Itambe", 100, "São Paulo"));
	enderecos.add(new Endereco("Rua Riachuelo", 1040, "Rio de Janeiro"));
	enderecos.add(new Endereco("Avenida Afonso Pena", 120, "Campo Grande"));
	enderecos.add(new Endereco("Avenida Afonso Pena", 1240, "Americana"));
	enderecos.add(new Endereco("Avenida Afonso Pena", 1210, "Salvador"));
	enderecos.add(new Endereco("Rua Riacho Doce", 12110, "Salvador"));
	
//	Collections.sort(enderecos, new OrdenacaoLogradouro());
//	enderecos.forEach(s -> System.out.println(s));
//	System.out.println("|------------------------|");
	
//	Collections.sort(enderecos, new OrdenacaoCidade());
//	enderecos.forEach(s -> System.out.println(s));
	
	enderecos
		.stream() // fluxo // permite executar vários métodos de forma encadeada
		.sorted( (s1,s2) -> s1.getCidade().compareTo(s2.getCidade()))
		//.filter(s -> s.getCidade().startsWith("C"))
		.forEach(s -> System.out.println(s));		
		
	}
	
}
	

