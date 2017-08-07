import javax.swing.JOptionPane;


public class LeituraGrafica {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
				
		String s_idade =  JOptionPane.showInputDialog("Informe sua idade: ");
		int idade = Integer.parseInt(s_idade);
				
		// int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
				
		String s_salario = JOptionPane.showInputDialog("Informe seu salario: ");
		double salario =  Double.parseDouble(s_salario);

		// double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
				
		String resposta = "Primeiro nome: " + nome +
				  "\nIdade: " + idade +
				  "\nSalário: R$ " + salario +
				  "\n" + ((idade < 18) ? "Menor de idade":"Maior de idade");

		System.out.println(resposta);
		
		JOptionPane.showMessageDialog(null, resposta);
	}

}
