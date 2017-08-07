import javax.swing.JOptionPane;


public class ComandoIf02 {

	public static void main(String[] args) {
		// 
		
		/*
		 * Um funcionário gasta R$ 3,80 em duas conduções diárias
		 * para trabalhar. A empresa onde ele trabalha oferece
		 * vale transporte, e desconta 6% do seu salário até o limite 
		 * de gastos que o funcionário mantém. COnsiderando que o
		 * funcionário trabalha em média 22 dias úteis, escreva um
		 * programa que, com base no salário, calcule e apresente o valor
		 * descontado do vale transporte.
		 * 
		 * gasto mensal médio - 167,20
		 * 
		 * Perguntar o valor do salário e decidir 
		 * 
		 */

		//variáveis
		double valorPassagem, quantidadeDiaria, numeroDias, salario;
		final double porcentagem =6;
		
		valorPassagem = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da passagem: "));
		quantidadeDiaria = Double.parseDouble(JOptionPane.showInputDialog(null, "Qtde. de Diárias: "));
		numeroDias = Double.parseDouble(JOptionPane.showInputDialog(null, "Número de Dias: "));
		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Salário: "));
		
		double valorGasto = valorPassagem * quantidadeDiaria * numeroDias;
		double valorDescontado;
		
			if((salario * porcentagem / 100) > valorGasto) {
			valorDescontado = valorGasto;
	     	}
			else {
		    valorDescontado = salario * porcentagem / 100;
			}
		
		
		String resposta = "Valor do salário: " + salario +
						  "\nDesconto com vale transporte: " + valorDescontado;
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
}		
		


