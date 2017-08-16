package br.com.impacta.classes;

import br.com.impacta.interfaces.Operacao;

public class OperacaoImpl implements Operacao {

	@Override
	public double executar(double a, double b) {		
		return 2*a + 3*b;
	}
}
