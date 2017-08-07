import javax.swing.JOptionPane;


public class EstruturaDoWhile03 {

	public static void main(String[] args) {
	
		/*
		 * Neste programa, o usuário deverá digitar uma
		 * certa quantidade de números inteiros. Esses
		 * números serão exibidos na tela somente se forem 
		 * positivos.Se o usuário informar o número 0, o programa 
		 * para de exibir e interrompe a estrutura de repetição. 
		 */
		
		do {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
				if(valor == 0){
				break; 
				}
				if(valor < 0){
				continue;
				}
				System.out.println(valor);
			} 
		while(true);{ //vai ser executada sempre
		System.out.println("---FIM----");
			}
	
	}
}