import javax.swing.JOptionPane;


public class ComandoIf02 {

	public static void main(String[] args) {
		// 
		
		/*
		 * Um funcion�rio gasta R$ 3,80 em duas condu��es di�rias
		 * para trabalhar. A empresa onde ele trabalha oferece
		 * vale transporte, e desconta 6% do seu sal�rio at� o limite 
		 * de gastos que o funcion�rio mant�m. COnsiderando que o
		 * funcion�rio trabalha em m�dia 22 dias �teis, escreva um
		 * programa que, com base no sal�rio, calcule e apresente o valor
		 * descontado do vale transporte.
		 * 
		 * gasto mensal m�dio - 167,20
		 * 
		 * Perguntar o valor do sal�rio e decidir 
		 * 
		 */

		//vari�veis
		double valorPassagem, quantidadeDiaria, numeroDias, salario;
		final double porcentagem =6;
		
		valorPassagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da passagem: "));
		quantidadeDiaria = Double.parseDouble(JOptionPane.showInputDialog(null, "Qtde. de Di�rias: "));
		numeroDias = Double.parseDouble(JOptionPane.showInputDialog(null, "N�mero de Dias: "));
		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Sal�rio: "));
		
		double valorGasto = valorPassagem * quantidadeDiaria * numeroDias;
		double valorDescontado;
		
			if((salario * porcentagem / 100) > valorGasto) {
			valorDescontado = valorGasto;
	     	}
			else {
		    valorDescontado = salario * porcentagem / 100;
			}
		
		
		String resposta = "Valor do sal�rio: " + salario +
						  "\nDesconto com vale transporte: " + valorDescontado;
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
}		
		


