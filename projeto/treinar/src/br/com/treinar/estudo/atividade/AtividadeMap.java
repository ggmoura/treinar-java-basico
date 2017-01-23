package br.com.treinar.estudo.atividade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AtividadeMap {

	public static void main(String[] args) {
		Character primeiraLetra = null;
		Map<Character, List<String>> mapNomes = new HashMap<>();
		List<String> nomes = new LinkedList<>();
		nomes.add("Jorge");
		nomes.add("Henrique");
		nomes.add("Jadine");
		nomes.add("Gleidson");
		nomes.add("Hugo");
		nomes.add("Cristiano");
		nomes.add("Cristiano");
		nomes.add("Arturo");
		nomes.add("Artur");
		nomes.add("Karina");
		nomes.add("Bruno");
		nomes.add("Gabriel");
		
		nomes.sort((a, b) -> a.compareTo(b));
		
		for (String nome : nomes) {
			primeiraLetra = nome.charAt(0);//recupera a primeira letra, representa a posicao 0
			if (!mapNomes.containsKey(primeiraLetra)) {
				mapNomes.put(primeiraLetra, new ArrayList<>());
			}
			mapNomes.get(primeiraLetra).add(nome);
		}
		System.out.println(mapNomes);
		Set<Entry<Character, List<String>>> entrySet = mapNomes.entrySet();
		System.out.println("\n\n\n\n");
		for (Entry<Character, List<String>> entry : entrySet) {
			System.out.println(entry);
		}
		
	}

}
