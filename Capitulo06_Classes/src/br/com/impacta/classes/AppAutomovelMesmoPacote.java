package br.com.impacta.classes;

public class AppAutomovelMesmoPacote {
	public static void main(String[] args) {
		
		//Criamos uma variável chamada auto 
		//do tipo Automovel e definimos um objeto referenciado por ela
		// nesse caso, dizemos que INSTANCIAMOS a flasse automovel
		// criar um objeto é instanciar uma classe
		Automovel auto = new Automovel(); //toda vez que você usa o operador new, 
										  //você cria um objeto na memória heap. o objeto é que vai ter a marca
										  //todo método que tem mesmo nome da classe define o que vai dentro do objeto
										  //na prática, o objeto foi criado. há uma referência da stack para a heap
										  //classe é o molde
		auto.marca = "Ford";
		auto.modelo = "Fiesta";
		auto.ano = 2016;
		
		// criamos uma nova variável chamada auto2, que referencia o
		// mesmo objeto referenciado por auto
		// duas variáveis podem apontar para o mesmo objeto
		Automovel auto2 = auto;
		auto2.modelo = "Fusion";
		
		//A nova variável auto3 é criada e referencia uma
		// nova instância da classe
		Automovel auto3 = new Automovel();
		auto3.marca = "Hyundai";
		auto3.modelo = "HB20";
		auto3.ano = 2015;
		
		// Alteramos a referência de auto. ela passou a referenciar
		// o mesmo objeto referenciado por auto3
		// ter o mesmo atributo não quer dizer que as informações são iguais
		auto = auto3;
		
		
		//Exibimos os atributos dos objetos referenciados por cada variável
		System.out.println("Dados do objeto auto: ");
		System.out.println("Marca: " + auto.marca);
		System.out.println("Modelo: " + auto.modelo);
		System.out.println("Ano: " + auto.ano);
		// System.out.println("Objeto: "  + auto); --> só vai aparecer o endereço na memória
		System.out.println();
		System.out.println("Dados do objeto auto2: ");
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Modelo: " + auto2.modelo);
		System.out.println("Ano: " + auto2.ano);
		
		// auto3 = null; //a referência foi cortada, então não há nada a ser mostrado
		
		System.out.println();
		System.out.println("Dados do objeto auto3: ");
		System.out.println("Marca: " + auto3.marca);
		System.out.println("Modelo: " + auto3.modelo);
		System.out.println("Ano: " + auto3.ano);
		
}
}
