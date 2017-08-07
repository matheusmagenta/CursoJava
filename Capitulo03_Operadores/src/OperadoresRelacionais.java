
public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		int a = 10, b = 10, c = 10;
		
		boolean b1 = (a != b);     // false
		boolean b2 = (b == c);     // true
		boolean b3 = (--b > a++);  // 9 > 10 ? false 
		boolean b4 = (a++ == ++b); // 11 == 10? false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
