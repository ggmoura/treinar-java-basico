package br.com.treinar.estudo.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ordenacao {

	//Collections.sort(personList, (Person p1, Person p2) -> p1.firstName.compareTo(p2.firstName));
	//Collections.sort(personList, (p1, p2) -> p1.firstName.compareTo(p2.firstName));
	//personList.sort((p1, p2) -> p1.firstName.compareTo(p2.firstName));

	public static void main(String[] args) {
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
		System.out.print("Antes de ordenar: ");
		System.out.println(nomes);
		//ordenando
		Collections.sort(nomes);
		System.out.print("Depois de ordenar: ");
		System.out.println(nomes);
		
	}
	
}
