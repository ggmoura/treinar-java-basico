package br.com.treinar.estudo.object;

public class TesteEquals {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Maria Sophia");
		Pessoa p2 = new Pessoa();
		p2.setNome("Maria Sophia");
		
		Pessoa p3 = p;
		//comparando com == utiliza o local de memoria
		System.out.println("p == p2: " + (p == p2));
		
		//comparando com o equals compara o conteudo do objeto
		System.out.println("p.equals(p2): " + p.equals(p2));
		
		System.out.println(p == p3);
	}
	
}
