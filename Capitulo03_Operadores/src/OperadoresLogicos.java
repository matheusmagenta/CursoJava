
public class OperadoresLogicos {

	public static void main(String[] args) {
		int a = 10, b = 10, c = 10;
		
		boolean b1 = (a <=10) && (b==0);
		System.out.println("b1 = " + b1);
		
		boolean b2 = (a != b++) || (--c > 0);
		System.out.println("b2 = " + b2);
		System.out.println("a = "  + a); // a = 10
		System.out.println("b = "  + b); // b = 11
		System.out.println("c = "  + c); // c = 9
		System.out.println();
		
		boolean b3 = !(c != 9 ) && (++b ==11);
		System.out.println("b3 = " + b3);
		System.out.println("a = "  + a);
		System.out.println("b = "  + b);
		System.out.println("c = "  + c);
		System.out.println();
		
	}

}
