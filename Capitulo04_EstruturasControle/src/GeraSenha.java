import javax.swing.JOptionPane;


public class GeraSenha {
	public static void main(String[] args) {
	
		/*
		 * O programa dever� gerar uma senha num�rica,
		 * onde cada d�gito � produzido aleatoriamente.
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
										"Confirma��o", 
										JOptionPane.YES_NO_OPTION);
			
			if(opcao == JOptionPane.NO_OPTION) {
			break;
			}
		}
			
		}
		
}
