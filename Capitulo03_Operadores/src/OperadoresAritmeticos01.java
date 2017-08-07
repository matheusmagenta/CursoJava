
public class OperadoresAritmeticos01 {

	public static void main(String[] args) {
		int a, b, c;
		a = b = c = 10; // atribuição simultânea
		
		System.out.println(a+b+c);
		System.out.println("Soma: " + a + b + c); // concatenação
		System.out.println("Soma: " + (a + b + c)); // concatenação + soma
		System.out.println(a + b + c + " = resposta"); // soma + concatenação

		int x = a + b;
		System.out.println(x);
		
	}

}
