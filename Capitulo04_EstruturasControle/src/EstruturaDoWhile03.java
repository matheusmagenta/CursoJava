import javax.swing.JOptionPane;


public class EstruturaDoWhile03 {

	public static void main(String[] args) {
	
		/*
		 * Neste programa, o usu�rio dever� digitar uma
		 * certa quantidade de n�meros inteiros. Esses
		 * n�meros ser�o exibidos na tela somente se forem 
		 * positivos.Se o usu�rio informar o n�mero 0, o programa 
		 * para de exibir e interrompe a estrutura de repeti��o. 
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