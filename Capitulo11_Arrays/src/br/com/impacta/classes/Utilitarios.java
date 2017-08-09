package br.com.impacta.classes;

public class Utilitarios {
	
	// metodo est�tico que recebe dois par�metros inteiros e retorna
	// a soma destes par�metros.
	public static int calcularSoma(int x, int y){
		return x + y;
	}

	//m�todo est�tico que recebe dois par�metros reais 
	// representando os lados de um retengulo. Este m�todo
	//dever� retornar true, se os dois lados forem iguais,
	//e false, caso contr�rio.
	
	public static boolean verificarQuadrado(double a, double b){
		return a == b;
	}
    // m�todo est�tico que recbe um texto como par�metro e retorna
	// a quantidade de caracteres, desconsiderando espa�o em branco.
	public static int contarDigitos(String texto){
		//String novoTexto = texto.replace(" ","");
		//int quantidade = novoTexto.lenght();
		//return quantidade;
		
		return texto.replace(" ", "").length();	
	}

	// m�todo que recebe um texto e verifica se � palindromo. Se for
	// retorna true; caso contr�rio, retorna false.
	public static boolean verificarPalindromo(String texto){
		
		String novo = texto.replace(" ", "");
		String invertido = new StringBuilder(novo).reverse().toString();
		
		return novo.equalsIgnoreCase(invertido);
	}
	
	//m�todo que recebe um n�mero inteiro e retorna o fatorial
	//deste n�mero
	//5! = 5 * 4 * 3 * 2 * 1 = 1 * 2 * 3 * 4 * 5 = 120
	//Por defini��o: 0! = 1 , 1! = 1
	
	public static int calcularFatorial(int numero){
	//	int fatorial = 1;
	//	for (int i = 2; i <= numero; i++) {
	//		fatorial *= i;
	//	}
	//  return fatorial;
		return numero <= 0 ? 1 : numero * calcularFatorial(numero -1);
		
	}
	
	//==================================================
	// Passagem de array como par�metro
	
	//m�todo que recebe um array de inteiros como 
	//par�metro e retorna a soma do primeiro com o �ltimo elemento
	
	public static int somarExtremos(int[] valores){
		if(valores.length < 2){
			return 0;
		}
		return valores[0] + valores[valores.length - 1];
		
		
		}
	}


