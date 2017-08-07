package br.com.impacta.classes;

public class Endereco {
	private String logradouro;
	private int numero;
	private String cidade;
	
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
		if(numero < 0){
			this.numero=1; 
		} else {
		this.numero = numero;
				}
		}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	//método para retornar os dados do endereço
	public String exibirEndereco(){
		String resposta  = "Logradouro: " + this.getLogradouro() +
						   "\nNumero: "	+ this.getNumero() +
						   "\nCidade: " + this.getCidade();
		return resposta;
	}
	
	
}
