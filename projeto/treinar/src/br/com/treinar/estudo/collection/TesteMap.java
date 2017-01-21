package br.com.treinar.estudo.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
	
		System.out.println("Primeira Letra".substring(0, 1));
		System.out.println("Primeira Letra".charAt(0));
		String[] nomes = {"Ana","Paula","Alan","Jorge","Luiz","Pedro","Isis"};
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("Zara", "8");//o primeiro objeto sempre serah a chave, o segundo o valor
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");

		System.out.println();
		System.out.println(" Map Elements");
		System.out.println("\t" + m1);
		//retorna todas as chaves em um objeto do tipo set
		System.out.println(m1.keySet());
		//retorna todos os valores em um objeto collection 
		System.out.println(m1.values());
		
		Set<Entry<String, String>> entrySet = m1.entrySet();
		
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
