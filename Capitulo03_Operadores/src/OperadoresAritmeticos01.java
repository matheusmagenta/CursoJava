
public class OperadoresAritmeticos01 {

	public static void main(String[] args) {
		int a, b, c;
		a = b = c = 10; // atribui��o simult�nea
		
		System.out.println(a+b+c);
		System.out.println("Soma: " + a + b + c); // concatena��o
		System.out.println("Soma: " + (a + b + c)); // concatena��o + soma
		System.out.println(a + b + c + " = resposta"); // soma + concatena��o

		int x = a + b;
		System.out.println(x);
		
	}

}
