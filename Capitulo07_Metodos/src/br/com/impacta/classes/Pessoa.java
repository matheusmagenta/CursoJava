package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	
	// Regra: a idade n�o pode ser negativa
	// Se o usu�rio fornecer uma idade negativa
	// o m�todo considerar� o valor zero
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	//m�todo preparado para evitar valor negativo no atributo
	public void setIdade(int idade) {
		if(idade < 0){
			this.idade=0; 
		} else {
		this.idade = idade;
				}
	}
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public void atribuirDados(String nome, int idade, Sexo sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	
	/*
	 * Este m�todo se aplica somente a aplica��es do tipo console,
	 * pois ele mostra na tela os valores dos atributos, n�o 
	 * permitindo nenhuma outra utiliza��o para eles
	 */
	
	public void mostrarDados(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Sexo: " + this.getEndereco());
	}
		

	
	/*
	 * Sobrecarga de m�todos: dois ou mais m�todos est�o sobrecarregados quando tiverem:
	 * - o mesmo nome
	 * - o tipo de retorno compat�veis
	 * - par�metros diferentes (tipo ou quantidade ou ambos)
	 */
	
	
	public String exibirPessoa(){
		   return exibirPessoa("Dados Pessoais");
	}	
	
	public String exibirPessoa(String titulo){
				
		String resposta = titulo + "Nome: " + this.getNome() +
						  "\nIdade: " + this.getIdade() +
					      "\nSexo: " + this.getSexo();
			if(this.getEndereco() != null){ 
			   resposta += "\n\nDADOS DO ENDERECO: " + 
						   "\n" + this.getEndereco().exibirEndereco();
			}
		return resposta;
}
	
	
	//m�todo que retorna a informa��o sobre a maioridade da pessoa
	public boolean verificarMaioridade(){
//			if(this.idade >= 18){
//				return true;
//		  } else {
//				return false;
//		}
		return this.getIdade() >= 18;
				
	}
			
	}
		
	
	
	



