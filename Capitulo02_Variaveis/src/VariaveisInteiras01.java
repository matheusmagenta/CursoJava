
public class VariaveisInteiras01 {
	public static void main(String[] args) {
		
		byte b1 = 120; // -128 a 127
		short s1 = 32000; //-32768 a 32767
		int i1= 150000; //-2147483648 a 2147483647
						
		//e o tipo long? veremos em instantes...
		
		//opera��es com tipos inteiros
		byte soma1 = 10 + 10;
		
		byte op1 = 10;
		byte op2 = 120;
		byte soma2 = (byte)(op1 + op2);
		
		System.out.println("soma2 = " + soma2);
		
		long numerogrande = 3000000000L; 
		
		/*
		 * o valor � 3000000000, apesar de ser compativel
		 * com o tipo long, � tratado pelo compilador como int; 
		 * nesse caso, � necess�rio incluir a letra "L" no final do
		 * n�mero, de forma a for��-lo a ser armazenado como long
		 */
		
		
	}
}