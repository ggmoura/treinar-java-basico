package br.com.treinar.estudo.collection;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<>();
		a1.add("Gleidson");
		a1.add("Maria Sophia");
		a1.add("Maria Sophia");
		//a1.add(10);
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);
		
		for (String objeto : a1) {
			//if (object instanceof String) {
				System.out.println(objeto.length());				
			//}
		}
		
		
		
		Set a2 = new HashSet();
		a2.add("Gleidson");
		a2.add("Maria Sophia");
		a2.add("Maria Sophia");
		a2.add(10);
		System.out.println(" HashSet Elements");
		System.out.print("\t" + a2);
		
		
		

	}
}