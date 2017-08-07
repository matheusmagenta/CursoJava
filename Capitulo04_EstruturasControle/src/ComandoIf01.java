import javax.swing.JOptionPane;


public class ComandoIf01 {

	public static void main(String[] args) {

		/* 
		 * Em uma escola, o valor da mensalidade é pago integralmente 
		 * por alunos que tenham até 59 anos. A partir de 60 anos, 
		 * haverá um desconto de 20% no valor da mensalidade.
		 * Escreva um programa que solicite ao usuário:
		 * 		- o nome do aluno
		 * 		- a idade
		 *  	- o valor da mensalidade
		 *  
		 * Com base nessas informações, o programa apresentará:
		 *  	- o nome do aluno
		 *  	- a mensalidade oficial
		 *  	- a mensalidade paga (com ou sem desconto)
		 */
	
		String nome = JOptionPane.showInputDialog("Escreva seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva sua idade: "));
		double mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Escreva sua mensalidade: "));
		double desconto = 0;
		
		
		if(idade > 59) {
			desconto = mensalidade * 20 / 100;
			
		}
			
		double valorFinal = mensalidade - desconto;
		
		String resposta = "Nome do aluno: " + nome +
				          "\nMensalidade oficial: " + mensalidade +
						  "\nValor pago: " + valorFinal;
		
		JOptionPane.showMessageDialog(null, resposta);
 				
		
	
		
		
	
	
	}
	
	

}
