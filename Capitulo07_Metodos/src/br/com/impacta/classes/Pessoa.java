package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	
	// Regra: a idade não pode ser negativa
	// Se o usuário fornecer uma idade negativa
	// o método considerará o valor zero
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	//método preparado para evitar valor negativo no atributo
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
	 * Este método se aplica somente a aplicações do tipo console,
	 * pois ele mostra na tela os valores dos atributos, não 
	 * permitindo nenhuma outra utilização para eles
	 */
	
	public void mostrarDados(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Sexo: " + this.getEndereco());
	}
		

	
	/*
	 * Sobrecarga de métodos: dois ou mais métodos estão sobrecarregados quando tiverem:
	 * - o mesmo nome
	 * - o tipo de retorno compatíveis
	 * - parâmetros diferentes (tipo ou quantidade ou ambos)
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
	
	
	//método que retorna a informação sobre a maioridade da pessoa
	public boolean verificarMaioridade(){
//			if(this.idade >= 18){
//				return true;
//		  } else {
//				return false;
//		}
		return this.getIdade() >= 18;
				
	}
			
	}
		
	
	
	



