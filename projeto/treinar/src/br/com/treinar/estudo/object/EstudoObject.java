package br.com.treinar.estudo.object;

public class EstudoObject {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Maria Sophia");
		p.setIdade(4);
		System.out.println(p);
		
		System.out.println(p.getIdade());
	}
	
}
