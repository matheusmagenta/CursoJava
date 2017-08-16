package br.com.impacta.classes;

import java.util.Comparator;

public class OrdenacaoLogradouro implements Comparator<Endereco> {

	@Override
	public int compare(Endereco o1, Endereco o2) {
		if(o1.getLogradouro().compareTo(o2.getLogradouro()) == 0){
			return o1.getCidade().compareTo(o2.getCidade());
		}
		return o1.getLogradouro().compareTo(o2.getLogradouro());
	}
	
}
