import javax.swing.JOptionPane;


public class ComandoIf04 {

	public static void main(String[] args) {
		/*
		 * Em uma escola, o aluno recebe um desconto na mensalidade
		 * de acordo com os seguintes critérios:
		 * 
		 * - Se sua média for igual ou superior a 9,5 - desconto de 30%
		 * - Se o período de aula for diurno - desconto de 10%
		 * 
		 * Os descontos são cumulativos.
		 * 
		 * Escreva um programa que solicite a média, o período e o valor
		 * da mensalidade. Com base nessas informações, o programa deve 
		 * exibir:
		 * 
		 * - o valor da mensalidade normal
		 * - o valor da mensalidade efetivamente paga 
		 * 
		 */

		double media = Double.parseDouble(JOptionPane.showInputDialog("Média do aluno: "));
		double mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Mensalidade: "));
		
		int periodo = Integer.parseInt(JOptionPane.showInputDialog("Período: 1,diurno ou 2,noturno"));
				
		double mensalidadePaga = mensalidade;
		
		if(periodo == 1){
			mensalidadePaga = mensalidadePaga * (1 - 10.0/100);
		}
		
		if(media >= 9.5){
			mensalidadePaga = mensalidadePaga * (1 - 30.0/100);  
		}
		
					
		String resposta = "Mensalidade normal: " + mensalidade +
						  "\nMensalidade paga: " + mensalidadePaga;	
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}

}
