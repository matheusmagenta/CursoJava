
public class OperadoresAritmeticos02 {
	public static void main(String[] args) {
		
		int x = 10, y = 3;
		//divis�o inteira
		int div1 = x / y;
		System.out.println("div1 = "  + div1);
		
		double div2 = x / y;
		System.out.println("div2 = "  + div2);
		
		//criando uma divis�o real a partir de inteiros
		double div3 = (double)x /  y; // valor instant�neo de x
		System.out.println("div3 = " + div3);
		
		//divis�o tradicional
		double a = 10, b = 3;
		double div4 = a / b;
		System.out.println("div4 = " + div4);
		
		//resto da divis�o
		int resto = x % y;
		System.out.println("resto da divis�o de x por y = " + resto);
		
		
		
	}

}
