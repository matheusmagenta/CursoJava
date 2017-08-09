package br.com.impacta.interfaces;

public interface Figura {

	/*
	 * Por defini��o, TODOS os atributos em interfaces
	 * s�o: public, static e final,  
	 */
	String DESCRICAO = 
		"Interface responsavel por definir comportamentos de figuras";
	
	/*
	 * Por defini��o, TODOS os m�todos em interfaces 
	 * s�o: public e abstract
	 */
	double calcularArea();
	
	/*
	 * Novidades no Java 8: m�todos est�ticos e m�todos default
	 */
	//M�todo est�tico: executado a partir do nome da interface
	public static String mostrarArea(Figura figura){
		String resposta = "Classe: " + figura.getClass().getSimpleName() +
					      "\n�rea: " + figura.calcularArea();
		return resposta;				
	}
	
	//M�todo default: m�todo comum a todos os objetos de classes que
	//implementam esta interface.
	//Obs: a referencia this aponta para o objeto da classe implementadora
	public default String exibirArea(){
		String resposta = "Classe: " + this.getClass().getSimpleName() +
				    	  "\nArea: " + this.calcularArea();
		return resposta;
	}
	
}











