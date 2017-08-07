import javax.swing.JOptionPane;


public class CaixaEletronico {
	public static void main(String[] args) {
		//valor do saque: int ou double? int por conta das divisões inteiras
		
		//int valorSaque = 95;
		//int valorOriginal = valorSaque;
		
		int valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque: "));
		
		if(valorSaque % 5 != 0){
			JOptionPane.showMessageDialog(null, "Pedido invalido");
			return; // interrompe a execução do método
			}
		
		int valorOriginal = valorSaque;
		
		//variaveis que representarão as quantidades de cédulas
		int q50, q20, q10, q5;
		q50 = q20 = q10 = q5 = 0;
		
		//notas de 50
		q50 = valorSaque / 50;
		valorSaque = valorSaque % 50;
		
		//notas de 20
		q20 = valorSaque / 20;
		valorSaque %= 20;
		
		//notas de 10
		q10 = valorSaque / 10;
		valorSaque = valorSaque % 10;
		
		//notas de 5 (não precisa atualizar o valor da variável porque ninguém vai usá-la)
		q5 = valorSaque / 5;
		
		//criando uma resposta e armazenando-a em uma variável
		String resposta = "Valor do saque: " + valorOriginal + 
		                  "\nNotas de 50: " + q50 +  					
		                  "\nNotas de 20: " + q20 +
		                  "\nNotas de 10: " + q10 +
		                  "\nNotas de 5: " + q5;
		
		//apresentando a resposta
		System.out.println(resposta);
		JOptionPane.showMessageDialog(null, resposta);
		
		
	}
	

}
