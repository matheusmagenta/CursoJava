
public class EstruturaDoWhile01 {

	public static void main(String[] args) {
		int contador = (int) (Math.random() * 10);
		do {
			System.out.println("contador: " + contador++);
		} while(contador < 5);
		System.out.println("----FIM----");
	}

}
