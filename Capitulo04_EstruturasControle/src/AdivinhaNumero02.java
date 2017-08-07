import javax.swing.JOptionPane;


public class AdivinhaNumero02 {
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
	
		int gerado = (int)(Math.random() *100);
		int digitado = 0, tentativas =0;
		
		do {
			tentativas++;
			digitado = Integer.parseInt(JOptionPane.showInputDialog ("INforme um número"));
			if (digitado > gerado){
				JOptionPane.showMessageDialog(null,"Informe um número menor");
			} else if(digitado < gerado){
				JOptionPane.showMessageDialog(null,"Informe um número maior");
			}
		} while(gerado != digitado);
		JOptionPane.showMessageDialog(null,"VocÊ acertou em " + tentativas + " tentativas");
		
	}
}
		
		