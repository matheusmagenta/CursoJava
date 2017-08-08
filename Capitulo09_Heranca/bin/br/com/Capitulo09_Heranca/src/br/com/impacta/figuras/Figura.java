package br.com.impacta.figuras;

public abstract class Figura {
	
	public abstract double calcularArea();		
	
	/* Classe abstrata não pode ser instanciada. Ela permite
	a definição de métodos abstratos.
	
	Métodos abstratos não possuem conteúdo, apenas definição. Ele não faz
	nada na classe que o define (que deve ser abstrata), mas deve 
	obrigatoriamente ser implementado em qualquer subclasse.
	
	Por exemplo, o método calcularArea() abaixo deve ser implementado em todas as 
	subclasses de Figura
	
	
	o método abstrato serve para fornecer um contrato de implementação
	a fim de garantir o poliformismo.
	
	*/
	
	
}
