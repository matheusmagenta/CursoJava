package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.classes.Endereco;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa02 {
	public static void main(String[] args) {
	
		//criamos um objeto da classe Pessoa (uma nova pessoa)
		Pessoa p1 = new Pessoa();
		p1.setNome("Jefferson");
		p1.setIdade(-10);
		p1.setSexo(Sexo.MASCULINO);
						
		//criamos um endereco
		
		Endereco end = new Endereco();
		end.setLogradouro("Avenida Paulista");
		end.setNumero(1009);
		end.setCidade("São Paulo");
		
		//vinculamos esse novo endereço à pessoa (no caso o p1)
		p1.setEndereco(end);
		
		
		JOptionPane.showMessageDialog(null, p1.exibirPessoa());
		
		}
}
