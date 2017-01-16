package br.com.treinar.estudo.construtor;

import java.util.Scanner;

import br.com.treinar.modelo.Pessoa;

public class TesteConstrutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();
		sc.close();
		
		Pessoa jose = new Pessoa(nome, 36);
		
		System.out.println(jose.nome);
	}
	
}
