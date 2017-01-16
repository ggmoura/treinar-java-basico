package br.com.treinar.estudo.operador;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean ehMaiorDeIdade = true;
		boolean possuiIngresso = false;
		
		boolean podeEntrar = ehMaiorDeIdade & possuiIngresso;
		
		System.out.println(!podeEntrar);
		
	}
	
}
