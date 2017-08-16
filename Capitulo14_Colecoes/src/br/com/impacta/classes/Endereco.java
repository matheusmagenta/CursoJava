package br.com.impacta.classes;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String cidade;
	
	//Construtor
	public Endereco(String logradouro, int numero, String cidade){
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	// M�todo para retornar os dados do Endere�o.
	
	public String exibirEndereco() {
		String resposta = "Logradouro: " + this.getLogradouro() + 
				           "\nN�mero: " + this.getNumero() +
				           "\nCidade: " + this.getCidade();
		return resposta;
		
	}

	@Override
	public String toString(){
		return this.getLogradouro() + ", " + this.getNumero() + ", " + this.getCidade();
				
			}
	
	
}
