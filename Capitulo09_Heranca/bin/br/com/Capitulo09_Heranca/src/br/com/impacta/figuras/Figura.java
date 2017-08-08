package br.com.impacta.figuras;

public abstract class Figura {
	
	public abstract double calcularArea();		
	
	/* Classe abstrata n�o pode ser instanciada. Ela permite
	a defini��o de m�todos abstratos.
	
	M�todos abstratos n�o possuem conte�do, apenas defini��o. Ele n�o faz
	nada na classe que o define (que deve ser abstrata), mas deve 
	obrigatoriamente ser implementado em qualquer subclasse.
	
	Por exemplo, o m�todo calcularArea() abaixo deve ser implementado em todas as 
	subclasses de Figura
	
	
	o m�todo abstrato serve para fornecer um contrato de implementa��o
	a fim de garantir o poliformismo.
	
	*/
	
	
}
