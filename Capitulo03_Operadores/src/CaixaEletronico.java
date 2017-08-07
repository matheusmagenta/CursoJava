import javax.swing.JOptionPane;


public class CaixaEletronico {
	public static void main(String[] args) {
		//valor do saque: int ou double? int por conta das divis�es inteiras
		
		//int valorSaque = 95;
		//int valorOriginal = valorSaque;
		
		int valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque: "));
		
		if(valorSaque % 5 != 0){
			JOptionPane.showMessageDialog(null, "Pedido invalido");
			return; // interrompe a execu��o do m�todo
			}
		
		int valorOriginal = valorSaque;
		
		//variaveis que representar�o as quantidades de c�dulas
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
		
		//notas de 5 (n�o precisa atualizar o valor da vari�vel porque ningu�m vai us�-la)
		q5 = valorSaque / 5;
		
		//criando uma resposta e armazenando-a em uma vari�vel
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
