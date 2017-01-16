package br.com.treinar.estudo.controle;

import java.util.Scanner;

public class LoopFor {

	public static void main(String args[]) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantidade: ");
		
		int quantidade = leitor.nextInt();
		leitor.close();
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println(i + " Gleidson");
		}
	}
}