
public class OperadoresIncrementaisDecrementais {
	public static void main(String[] args) {
	
		int a = 10, b = 10, c = 10;
		System.out.println("Valores originais: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println();
		
		a++; //  a=11
		++b; //  b=11
		System.out.println("(a++) = " + a);
		System.out.println("(++b) = " + b);
		System.out.println();
		
		int x = a++;
		int y = ++b;
		System.out.println("(a++) = " + a);
		System.out.println("(++b) = " + b);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println();
		
		System.out.println(c++);
		System.out.println(++c);
		
		//Quiz
		// a = 12, b = 12, c = 12
		x = a++ + --c;
		y = 2 *(b-- - --a);
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		
		
		
		
}
}
