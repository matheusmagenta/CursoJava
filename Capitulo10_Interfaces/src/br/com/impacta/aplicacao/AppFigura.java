package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;

public class AppFigura {
	public static void main(String[] args) {
		
		//Primeira utilização: classe Retangulo utilizando o método
		//estático
		//Retangulo retangulo = new Retangulo(12, 14);
		Figura retangulo = new Retangulo(12, 14);
		JOptionPane.showMessageDialog(null, Figura.mostrarArea(retangulo));
		
		//Segunda utilização: classe Circulo utilizando o método default
		//Circulo circulo = new Circulo(10);
		Figura circulo = new Circulo(10);
		JOptionPane.showMessageDialog(null, circulo.exibirArea());
		
	}
}








