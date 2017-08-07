import javax.swing.JOptionPane;


public class AdivinhaNumero02 {
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
	
		int gerado = (int)(Math.random() *100);
		int digitado = 0, tentativas =0;
		
		do {
			tentativas++;
			digitado = Integer.parseInt(JOptionPane.showInputDialog ("INforme um n�mero"));
			if (digitado > gerado){
				JOptionPane.showMessageDialog(null,"Informe um n�mero menor");
			} else if(digitado < gerado){
				JOptionPane.showMessageDialog(null,"Informe um n�mero maior");
			}
		} while(gerado != digitado);
		JOptionPane.showMessageDialog(null,"Voc� acertou em " + tentativas + " tentativas");
		
	}
}
		
		