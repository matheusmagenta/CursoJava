import java.util.Scanner;


public class LeituraScanner {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Simula��es de entrada
		System.out.println("Informe seu primeiro nome: ");
		String nome = teclado.next();
		
		System.out.println("Informe sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("Informe seu sal�rio: ");
		double salario = teclado.nextDouble();
		
		String resposta = "Primeiro nome: " + nome +
						  "\nIdade: " + idade +
						  "\nSal�rio: R$ " + salario +
						  "\n" + ((idade < 18) ? "Menor de idade":"Maior de idade");
		
		System.out.println(resposta);
	}

}
