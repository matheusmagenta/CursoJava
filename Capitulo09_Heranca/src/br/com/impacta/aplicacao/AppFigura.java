package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.figuras.Circulo;
import br.com.impacta.figuras.Figura;
import br.com.impacta.figuras.Retangulo;

public class AppFigura {
	public static void main(String[] args) {
	
		Retangulo retangulo = new Retangulo(10,12);
		Circulo circulo = new Circulo(10);
		
		mostrarFigura(retangulo);
		mostrarFigura(circulo);
		
	}
	
	public static void mostrarFigura(Figura figura){
		
		String nomeClasse = figura.getClass().getName();
		
		String resposta = "Área calculada: " + figura.calcularArea();
		JOptionPane.showMessageDialog(null, nomeClasse + "\n" + resposta);
		
	}
	
	
}
