package br.com.treinar.estudo.fluxo;

public class DecisionMaking {

	public static void main(String[] args) {
		boolean ehNoite = true;
		boolean estahChovendo = true;

		if (ehNoite && estahChovendo) {
			System.out.println("Bom pra tomar uma cerveja...");
		} else {
			System.out.println("Tomar Banho...");
			System.out.println("Bom para dormir...");
		}

		int opcao = 1;

		if (opcao == 1) {
			System.out.println("Um");
		} else if (opcao == 2) {
			System.out.println("Dois");
		} else if (opcao == 3) {
			System.out.println("Um");
		} else if (opcao == 4) {
			System.out.println("Um");
		} else if (opcao == 5) {
			System.out.println("Um");
		} else {
			System.out.println("Numero não encontrado");
		}

		
		switch (opcao) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;

		default:
			System.out.println("Numero não encontrado");
			break;
		}
		
	}

}
