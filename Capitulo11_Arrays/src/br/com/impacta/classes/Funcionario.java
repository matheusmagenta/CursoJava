package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Funcionario extends Pessoa {

	private String cpf;
	private String cargo;
	private double salario;
	
	
	// construtores 
	public Funcionario(String nome){
		super(nome);
	}
	public Funcionario(String nome, 
					   String cpf, 
					   String cargo, 
					   double salario){
					
		super(nome);
		this.setCpf(cpf);
		this.setCargo(cargo);
		this.setSalario(salario);
		
	}

	public Funcionario(String nome,
			   int idade,
			   Sexo sexo,
			   String cpf, 
			   String cargo, 
			   double salario){
			
//			super(nome, idade, sexo);
//			this.setCpf(cpf);
//			this.setCargo(cargo);
//			this.setSalario(salario);
			
			
			this(nome, cpf, cargo, salario);
			this.setIdade(idade);
			this.setSexo(sexo);
}
	
	
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String exibir(){
		String resposta = super.exibir() +
						"\nCPF: " + this.getCpf() +
						"\nCargo: " + this.getCargo() +
						"\nSalario: " + this.getSalario();
		return resposta;
	}

}
