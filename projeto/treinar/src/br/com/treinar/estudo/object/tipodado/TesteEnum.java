package br.com.treinar.estudo.object.tipodado;

import java.util.Arrays;

public class TesteEnum {

	public static void main(String[] args) {
		Sexo[] sexos = Sexo.values();
		
		//converte um array estatico em um Collection e imprime os elementos
		Arrays.asList(sexos).forEach((s) -> System.out.println(s));

		//recupera uma instancia de sexo a partir da String que o representa
		Sexo sexoF = Sexo.valueOf("F");
		
		//imprime a descricao do enum sexo 
		System.out.println(sexoF.getDescricao());
		
		//imprime uma instacia do enum
		System.out.println(sexoF);
		
		//imprime a posicao do enum no array
		System.out.println(sexoF.ordinal());
	
	}
	
}
