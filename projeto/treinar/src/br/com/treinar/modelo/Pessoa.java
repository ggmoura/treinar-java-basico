package br.com.treinar.modelo;

public class Pessoa {

	public int idade;
	public String nome;
	public Long cpf;
	
	public Pessoa() {
		System.out.println("criando pessoa...");		
	}
	
	public Pessoa(String nome) {
		this();
		this.nome = nome;
		idade = 0;
	}
	
	
	public Pessoa(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}
	
	public Pessoa(int hora, int idade) {
		this("hoje");
		this.idade = idade;
	}

	
}
