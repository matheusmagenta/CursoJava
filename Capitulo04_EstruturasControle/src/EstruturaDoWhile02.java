import javax.swing.JOptionPane;


public class EstruturaDoWhile02 {

	public static void main(String[] args) {
		/*
		 * Neste programa, o usuário deverá digitar uma
		 * certa quantidade de números inteiros. Esses
		 * números serão exibidos na tela. Se o usuário
		 * informar o número 0, o programa para de
		 * exibir e interrompe a estrutura de repetição. 
		 */
		
		// usar o break encurta bastante o programa. atenção ao escopo de variável, que só vale dentro do bloco

				do {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
				if(valor == 0){
				break;
			}
			} while(true);{ //vai ser executada sempre
		System.out.println("---FIM----");
			}
	
	}
}