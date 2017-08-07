import javax.swing.JOptionPane;


public class ComandoIf03 {

	public static void main(String[] args) {
		/*
		 * Em um clube, o valor da entrada varia de acordo com a idade do visitante. 
		 * A variação ocorre de acordo com a tabela a seguir:
		 * 
		 * - Até 17 anos: R$ 50,00
		 * - Acima de 17, até 59 anos: R$ 60,00
		 * - A partir de 60 anos: R$ 30,00
		 * 
		 * Escreva o programa de forma a apresentar o valor da entrada em função 
		 * da idade do visitante
		 */
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade do visitante: "));
		
		double entrada;
		
		if(idade <= 17){
			entrada = 50;
		}
		else if(idade > 59){
			entrada = 30;
		}
		else {
			entrada = 60;
		}
		
		JOptionPane.showMessageDialog(null, "Idade: " + idade +
									"\nValor da entrada: " + entrada);
		
	}

}
