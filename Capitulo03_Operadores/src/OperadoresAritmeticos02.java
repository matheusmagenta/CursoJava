
public class OperadoresAritmeticos02 {
	public static void main(String[] args) {
		
		int x = 10, y = 3;
		//divisão inteira
		int div1 = x / y;
		System.out.println("div1 = "  + div1);
		
		double div2 = x / y;
		System.out.println("div2 = "  + div2);
		
		//criando uma divisão real a partir de inteiros
		double div3 = (double)x /  y; // valor instantâneo de x
		System.out.println("div3 = " + div3);
		
		//divisão tradicional
		double a = 10, b = 3;
		double div4 = a / b;
		System.out.println("div4 = " + div4);
		
		//resto da divisão
		int resto = x % y;
		System.out.println("resto da divisão de x por y = " + resto);
		
		
		
	}

}
