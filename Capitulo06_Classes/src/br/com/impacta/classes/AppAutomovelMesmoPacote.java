package br.com.impacta.classes;

public class AppAutomovelMesmoPacote {
	public static void main(String[] args) {
		
		//Criamos uma vari�vel chamada auto 
		//do tipo Automovel e definimos um objeto referenciado por ela
		// nesse caso, dizemos que INSTANCIAMOS a flasse automovel
		// criar um objeto � instanciar uma classe
		Automovel auto = new Automovel(); //toda vez que voc� usa o operador new, 
										  //voc� cria um objeto na mem�ria heap. o objeto � que vai ter a marca
										  //todo m�todo que tem mesmo nome da classe define o que vai dentro do objeto
										  //na pr�tica, o objeto foi criado. h� uma refer�ncia da stack para a heap
										  //classe � o molde
		auto.marca = "Ford";
		auto.modelo = "Fiesta";
		auto.ano = 2016;
		
		// criamos uma nova vari�vel chamada auto2, que referencia o
		// mesmo objeto referenciado por auto
		// duas vari�veis podem apontar para o mesmo objeto
		Automovel auto2 = auto;
		auto2.modelo = "Fusion";
		
		//A nova vari�vel auto3 � criada e referencia uma
		// nova inst�ncia da classe
		Automovel auto3 = new Automovel();
		auto3.marca = "Hyundai";
		auto3.modelo = "HB20";
		auto3.ano = 2015;
		
		// Alteramos a refer�ncia de auto. ela passou a referenciar
		// o mesmo objeto referenciado por auto3
		// ter o mesmo atributo n�o quer dizer que as informa��es s�o iguais
		auto = auto3;
		
		
		//Exibimos os atributos dos objetos referenciados por cada vari�vel
		System.out.println("Dados do objeto auto: ");
		System.out.println("Marca: " + auto.marca);
		System.out.println("Modelo: " + auto.modelo);
		System.out.println("Ano: " + auto.ano);
		// System.out.println("Objeto: "  + auto); --> s� vai aparecer o endere�o na mem�ria
		System.out.println();
		System.out.println("Dados do objeto auto2: ");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Modelo: " + auto2.modelo);
		System.out.println("Ano: " + auto2.ano);
		
		// auto3 = null; //a refer�ncia foi cortada, ent�o n�o h� nada a ser mostrado
		
		System.out.println();
		System.out.println("Dados do objeto auto3: ");
		System.out.println("Marca: " + auto3.marca);
		System.out.println("Modelo: " + auto3.modelo);
		System.out.println("Ano: " + auto3.ano);
		
}
}
