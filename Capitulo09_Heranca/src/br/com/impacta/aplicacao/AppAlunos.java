package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.AlunoGraduacao;

public class AppAlunos {
	public static void main(String[] args) {
		
		
		// aluno generalizado
		Aluno aluno1 = new Aluno("João");
		aluno1.setMatricula(100);
		aluno1.setCurso("Banco de dados");
		
		//aluno de graduacao
		AlunoGraduacao aluno2 = new AlunoGraduacao("Maria");
		aluno2.setMatricula(200);
		aluno2.setCurso("Turismo");
		aluno2.setDuracao(6);
		
		//terceiro tipo de aluno. eu posso ter um objeto da subclasse referenciando uma superclasse
		Aluno aluno3 = aluno2;
		
		
		// JOptionPane.showMessageDialog(null, aluno1.exibir());
		// JOptionPane.showMessageDialog(null, aluno2.exibir());
		JOptionPane.showMessageDialog(null, aluno3.exibir());
		
		
	}
	
}
