package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppInstanceOf {
	public static void main(String[] args) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe uma opção: "));
		Pessoa p = buscarPessoa(opcao);
		
		if(p instanceof Funcionario){
			JOptionPane.showMessageDialog(null, "Objeto Funcionario: \n" + p.exibir());
			} else if (p instanceof Aluno){
			  JOptionPane.showMessageDialog(null, "Objeto Aluno: \n" + p.exibir());
			} else if (p instanceof Pessoa){
			  JOptionPane.showMessageDialog(null, "Objeto Pessoa: \n" + p.exibir());	
			}
			else{
				JOptionPane.showMessageDialog(null, "Referencia nula!!!");
				}
		}
	
	
	public static Pessoa buscarPessoa(int tipo){
		Pessoa pessoa = null;
		
		if(tipo == 1){ //instancia de Pessoa
			pessoa = new Pessoa("Jose", 20, Sexo.MASCULINO);
			} else if(tipo == 2){
				pessoa = new Funcionario("Jose", "12345678900", "Motoboy", 3000);
			} else if(tipo == 3){
				pessoa = new Aluno("Jose", 20, Sexo.MASCULINO, 111, "Java");
			}
		return pessoa;
	}
}
