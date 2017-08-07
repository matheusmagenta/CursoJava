package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Pessoa {

	private String  nome;
	private int idade;
	private Sexo sexo ;
	private Endereco endereco;
	
	public final String INFO;
	
	// Construtores
	public Pessoa(String nome){
		this.setNome(nome);
		INFO = "IMPACTA TECNOLOGIA";
	}
	
	public Pessoa (String nome,int idade){
		this(nome);
		this.setIdade(idade);
	}
	public Pessoa (String nome,int idade, Sexo sexo){
		this(nome, idade);
		this.setSexo(sexo);
	}
	public Pessoa (String nome,int idade, Sexo sexo, Endereco endereco){
		this(nome, idade , sexo); // usado somente em construtores, e necess
		this.setEndereco(endereco);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			this.idade = 0;
		}else {
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
	
	public String exibirPessoa(){
		return exibirPessoa("DADOS PESSOAIS");	
	}
	
	public String exibirPessoa(String titulo){
		
		String resposta = titulo + "\n\nNome: " + this.getNome() +
				          "\nIdade: " + this.getIdade() + 
                          "\nSexo: " + this.getSexo();
		
		if (this.getEndereco() != null) {
			              resposta += "\n\nDADOS DO ENDEREÇO" + 
                          "\n" + this.getEndereco().exibirEndereco(); 
		}
		return resposta;	
	}
		
}

