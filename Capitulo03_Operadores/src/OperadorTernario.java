
public class OperadorTernario {
	public static void main(String[] args) {
	int idade = 10;
	String resultado;
	
	resultado = (idade < 18) ? "Menor de idade" : "Maior de idade";
	
	String resposta = "Idade: " + idade +
					  "\nResultado: " + resultado;
	
	System.out.println(resposta);
}
}
