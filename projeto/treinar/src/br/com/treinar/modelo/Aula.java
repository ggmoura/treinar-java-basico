package br.com.treinar.modelo;

public class Aula {
	
	public static void main(String[] args) {
		Pessoa aluno = new Pessoa();
		aluno.idade = 16;
		
		System.out.println(aluno.idade);
		
		Pessoa p = new Pessoa();
		p.idade = 36;
		
		Prova pv = new Prova();
		pv.materia = 'm';
		pv.nota = 100;
	}
	
}
