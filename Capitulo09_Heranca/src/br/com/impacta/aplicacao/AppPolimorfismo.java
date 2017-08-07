package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Jefferson", 30, Sexo.MASCULINO, "12345678900", "gerente", 10000);
		
		Object p2 = new Funcionario("Paulo", 32, Sexo.MASCULINO, "22345678900", "assistente", 5000);
		
		JOptionPane.showMessageDialog(null, p1.exibir());
		
		//desejamos atualizar a idade e o salario de p1. como fazer?
		// criamos uma referência do tipo funcionario e fazermos com que ela 
		// referencie um objeto do tipo funcionario, referenciado por p1
		// Ress: para a idade, poderíamos acessar por meio de p1. Para o salário,
		// será necessário definir uma nova referencia apontando para o mesmo 
		// objeto que p1, lembrando de ajustar as referencias por meio de typecast.
		// a vantagem é que há uma única variável, só precisa mudar ali
		
		if (p1 instanceof Funcionario) {
			Funcionario f1 = (Funcionario) p1;
			f1.setIdade(31);
			f1.setSalario(11000);
			JOptionPane.showMessageDialog(null, ((Funcionario) p1).exibir());
		}
		
		
		//desejamos atualizar o cargo e o salario de p2. como fazer?
		//Funcionario f2 = (Funcionario)p2; nesse caso vc n tem variavel
		// mas é como se você estivesse declarando três variaveis anonimas
		// é útil quando você quer fazer uma variação só
		
		if (p1 instanceof Funcionario) {
			((Funcionario) p2).setCargo("Diretora");
			((Funcionario) p2).setSalario(15000);
			JOptionPane.showMessageDialog(null, ((Funcionario) p2).exibir());
		}
				
		//JOptionPane.showMessageDialog(null, p2.exibir());
		
//-------------------------------------------------------------------
		
		Pessoa p3 = new Aluno("Joao", 23, Sexo.MASCULINO, 999, "java");
		
		if(p3 instanceof Aluno){
			((Aluno)p3).setCurso("Android");
			JOptionPane.showMessageDialog(null, p3.exibir());
			} else {
				JOptionPane.showMessageDialog(null, "p3 não é um aluno");
			}
		
	}
}


