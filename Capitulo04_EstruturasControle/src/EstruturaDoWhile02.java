import javax.swing.JOptionPane;


public class EstruturaDoWhile02 {

	public static void main(String[] args) {
		/*
		 * Neste programa, o usu�rio dever� digitar uma
		 * certa quantidade de n�meros inteiros. Esses
		 * n�meros ser�o exibidos na tela. Se o usu�rio
		 * informar o n�mero 0, o programa para de
		 * exibir e interrompe a estrutura de repeti��o. 
		 */
		
		// usar o break encurta bastante o programa. aten��o ao escopo de vari�vel, que s� vale dentro do bloco

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