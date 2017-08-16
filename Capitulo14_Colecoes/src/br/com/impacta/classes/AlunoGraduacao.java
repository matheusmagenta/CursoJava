package br.com.impacta.classes;

public class AlunoGraduacao extends Aluno {
	
	private int duracao; //semestres
	
	//construtor padrão
		public AlunoGraduacao(String nome){
			super(nome);
	    }
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	
	@Override 
	public String exibir(){
	String resposta = super.exibir() +
					  "\nDuracao: " + this.getDuracao();			
			
	return resposta;
	}
	
}