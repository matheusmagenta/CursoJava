import javax.swing.JOptionPane;


public class AdivinhaNumero {

	public static void main(String[] args) {
		/*
		 * O programa gera um valor aleatorio inteiro entre 0 e 100.
		 * Iterativamente, o usu�rio tenta adivinhar o n�mero geraod.
		 * Se o n�mero digitado por famior que o gerado, o programa
		 * deve avisar: "informe um n�mero menor".
		 * Caso contr�rio, se o n�mero digitado por menor que o gerado, 
		 * o programa deve avisar: "Informe um n�mero maior".
		 * Quando o usu�rio acertar, o programar deve apresentar
		 * o n�mero de tentativas
		 */

		int valor = (int) (Math.random() * 100);  
		int tentativa = Integer.parseInt(JOptionPane.showInputDialog("Escreva um n�mero"));
		int chute = 0;
		
		while(valor != tentativa){
			if(tentativa < valor){
			JOptionPane.showMessageDialog(null, "Informe um n�mero maior");
			} else {
			JOptionPane.showMessageDialog(null, "Informe um n�mero menor");
			}
			tentativa = Integer.parseInt(JOptionPane.showInputDialog("Escreva um n�mero"));	
				JOptionPane.showMessageDialog(null, "Tentativa n�mero :" + ++chute);
					continue;
		
		}
		
		
	}
	

}
