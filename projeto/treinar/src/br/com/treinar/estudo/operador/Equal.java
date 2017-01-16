package br.com.treinar.estudo.operador;

public class Equal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 11;
		
		System.out.println(a == b);
		System.out.println(a == c);
		
		Caneta bic = new Caneta();
		bic.cor = "Azul";
		bic.preco = 3.5;
		
		
		Caneta pena = new Caneta();
		pena.cor = "Azul";
		pena.preco = 3.5;
		
		
		System.out.println(bic == pena);
		
		Caneta copia = pena;
		
		System.out.println(copia == pena);
		System.out.println(copia.cor);
		
		
		copia = new Caneta();
		System.out.println(copia == pena);
		
	}
	
}
