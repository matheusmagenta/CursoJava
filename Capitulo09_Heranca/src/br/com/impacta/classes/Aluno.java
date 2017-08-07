package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	//construtor padrão
	public Aluno(String nome){
		super(nome);
    }
	
	public Aluno(String nome, int matricula, String curso){
		super(nome);
		this.setMatricula(matricula);
		this.setCurso(curso);
		}

	public Aluno(String nome, int idade, Sexo sexo, int matricula, String curso){
		this(nome,matricula,curso);
		super.setIdade(idade);
		super.setSexo(sexo);
		}
		
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String exibir(){
		String resposta = super.exibir() + 
						"\nMatricula: " + this.getMatricula() +
						"\nCurso: " + this.getCurso();
		return resposta;
	}
	
}
