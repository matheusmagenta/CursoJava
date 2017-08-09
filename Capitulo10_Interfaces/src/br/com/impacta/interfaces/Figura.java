package br.com.impacta.interfaces;

public interface Figura {

	/*
	 * Por definição, TODOS os atributos em interfaces
	 * são: public, static e final,  
	 */
	String DESCRICAO = 
		"Interface responsavel por definir comportamentos de figuras";
	
	/*
	 * Por definição, TODOS os métodos em interfaces 
	 * são: public e abstract
	 */
	double calcularArea();
	
	/*
	 * Novidades no Java 8: métodos estáticos e métodos default
	 */
	//Método estático: executado a partir do nome da interface
	public static String mostrarArea(Figura figura){
		String resposta = "Classe: " + figura.getClass().getSimpleName() +
					      "\nÁrea: " + figura.calcularArea();
		return resposta;				
	}
	
	//Método default: método comum a todos os objetos de classes que
	//implementam esta interface.
	//Obs: a referencia this aponta para o objeto da classe implementadora
	public default String exibirArea(){
		String resposta = "Classe: " + this.getClass().getSimpleName() +
				    	  "\nArea: " + this.calcularArea();
		return resposta;
	}
	
}











