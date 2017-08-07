import javax.swing.JOptionPane;


public class AdivinhaNumero {

	public static void main(String[] args) {
		/*
		 * O programa gera um valor aleatorio inteiro entre 0 e 100.
		 * Iterativamente, o usuário tenta adivinhar o número geraod.
		 * Se o número digitado por famior que o gerado, o programa
		 * deve avisar: "informe um número menor".
		 * Caso contrário, se o número digitado por menor que o gerado, 
		 * o programa deve avisar: "Informe um número maior".
		 * Quando o usuário acertar, o programar deve apresentar
		 * o número de tentativas
		 */

		int valor = (int) (Math.random() * 100);  
		int tentativa = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número"));
		int chute = 0;
		
		while(valor != tentativa){
			if(tentativa < valor){
			JOptionPane.showMessageDialog(null, "Informe um número maior");
			} else {
			JOptionPane.showMessageDialog(null, "Informe um número menor");
			}
			tentativa = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número"));	
				JOptionPane.showMessageDialog(null, "Tentativa número :" + ++chute);
					continue;
		
		}
		
		
	}
	

}
