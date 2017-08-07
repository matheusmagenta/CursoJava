package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Pessoa {

	private String  nome;
	private int idade;
	private Sexo sexo ;
	private Endereco endereco;
	private int codigo;
	
	private static int CONTADOR = 1;
	//é boa prática escrever variável static ou final em MAIÚSCULO, é uma variável compartilhada
	// comum a todos os objetos. é diferente de cada um ter um nome. mudou para um, mudou para todos
	
	// private static final String CURSO = "JAVA";
	// o atributo quando é final, significa que ele é inalterado; ele precisa ter algum valor
	// ou na hora de declarar ou depois. ele não tem amparo de nenhum objeto 
	
		// Construtores
	public Pessoa(String nome){
		this.setCodigo(CONTADOR++);
		this.setNome(nome);
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
	
	//o que definie um atributo que nada tem a ver necessariamente é a static)
	
	//getters e setters
	
	
	
	public int getCodigo(){
		return codigo;
	}
	
	private void setCodigo(int codigo) {
		this.codigo = codigo;  
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
	
	public String exibir(){
		return exibir("DADOS PESSOAIS");	
	}
	
	public String exibir(String titulo){
		
		String resposta = titulo + "\n\nCodigo: " + this.getCodigo() +
				          "\n\nNome: " + this.getNome() +
						  "\nIdade: " + this.getIdade() + 
                          "\nSexo: " + this.getSexo();
		
		if (this.getEndereco() != null) {
			              resposta += "\n\nDADOS DO ENDEREÇO" + 
                          "\n" + this.getEndereco().exibirEndereco(); 
		}
		return resposta;	
	}
		
}

