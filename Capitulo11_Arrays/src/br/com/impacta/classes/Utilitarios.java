package br.com.impacta.classes;

public class Utilitarios {
	
	// metodo estático que recebe dois parâmetros inteiros e retorna
	// a soma destes parâmetros.
	public static int calcularSoma(int x, int y){
		return x + y;
	}

	//método estático que recebe dois parâmetros reais 
	// representando os lados de um retengulo. Este método
	//deverá retornar true, se os dois lados forem iguais,
	//e false, caso contrário.
	
	public static boolean verificarQuadrado(double a, double b){
		return a == b;
	}
    // método estático que recbe um texto como parâmetro e retorna
	// a quantidade de caracteres, desconsiderando espaço em branco.
	public static int contarDigitos(String texto){
		//String novoTexto = texto.replace(" ","");
		//int quantidade = novoTexto.lenght();
		//return quantidade;
		
		return texto.replace(" ", "").length();	
	}

	// método que recebe um texto e verifica se é palindromo. Se for
	// retorna true; caso contrário, retorna false.
	public static boolean verificarPalindromo(String texto){
		
		String novo = texto.replace(" ", "");
		String invertido = new StringBuilder(novo).reverse().toString();
		
		return novo.equalsIgnoreCase(invertido);
	}
	
	//método que recebe um número inteiro e retorna o fatorial
	//deste número
	//5! = 5 * 4 * 3 * 2 * 1 = 1 * 2 * 3 * 4 * 5 = 120
	//Por definição: 0! = 1 , 1! = 1
	
	public static int calcularFatorial(int numero){
	//	int fatorial = 1;
	//	for (int i = 2; i <= numero; i++) {
	//		fatorial *= i;
	//	}
	//  return fatorial;
		return numero <= 0 ? 1 : numero * calcularFatorial(numero -1);
		
	}
	
	//==================================================
	// Passagem de array como parâmetro
	
	//método que recebe um array de inteiros como 
	//parâmetro e retorna a soma do primeiro com o último elemento
	
	public static int somarExtremos(int[] valores){
		if(valores.length < 2){
			return 0;
		}
		return valores[0] + valores[valores.length - 1];
		
		
		}
	}


