package br.com.treinar.estudo.array;

public class TesteArray {

	public static void main(String[] args) {
		System.out.printf("%d %s", 100000, "Hello");
		String[] nomes = new String[3];
		
		nomes[0] = "Gleidson";
		nomes[1] = "Karina";
		nomes[2] = "Jadine";
		System.out.println(nomes[0]);
		
		String[] nomes2 = {"Jorge", "Cristiano", "Arturo"};
		imprimir(nomes2);
		
		imprimirDois(10, nomes2);
		imprimirDois(2, "Jorge", "Cristiano", "Arturo", "Cristiano", "Jorge", "Cristiano", "Arturo", "Cristiano");
	}

	private static void imprimir(String[] nomes2) {
		Integer indice = 0;
		for (String nome : nomes2) {
			System.out.println(nome);
		}
	}
	
	//var args pode passar v
	private static void imprimirDois(int qtd, String... nomes) {
		System.out.println(qtd);
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
	
	
	
	private static String toString(Integer numero) {
		String texto = null;
		switch (numero) {
		case 1:
			texto = "um";
			break;
		case 2:
			texto = "dois";
			
			break;
		case 3:
			texto = "três";
			
			break;

		default:
			break;
		}
		return texto;
	}
	
}
