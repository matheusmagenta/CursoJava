import javax.swing.JOptionPane;


public class GeraSenha {
	public static void main(String[] args) {
	
		/*
		 * O programa deverá gerar uma senha numérica,
		 * onde cada dígito é produzido aleatoriamente.
		 * A senha final deve ser armazenada em uma string.
		 */
		
		while (true) {
			String senha = "";
			for (int i = 0; i < 6; i++) {
				senha += (int) (Math.random() * 10);
			}
			JOptionPane.showMessageDialog(null, senha);
			
			int opcao = JOptionPane.showConfirmDialog(null, 
										"Deseja continuar?", 
										"Confirmação", 
										JOptionPane.YES_NO_OPTION);
			
			if(opcao == JOptionPane.NO_OPTION) {
			break;
			}
		}
			
		}
		
}
