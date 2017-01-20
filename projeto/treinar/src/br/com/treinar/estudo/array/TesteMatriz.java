package br.com.treinar.estudo.array;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteMatriz {

	
	public static void main(String[] args) {
		Object[][] matriz = {		  /*[0]  [1]  [2] [3]*/
							/*[0]*/{new Date(),  20,  "Palavra"}, 
							/*[1]*/{40,  "Gleidson",  60, 99}, 
							/*[2]*/{70,  80,  90}, 
							/*[3]*/{true, 110, 120}};
		
		System.out.println("Posicao [1, 1]: " + matriz[1][1]);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz.length == 0 && matriz[i].length == 0) {
					System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(matriz[i][j]));
				} else {
					System.out.print(matriz[i][j] + "\t");					
				}
			}
			System.out.println();
		}
	}
	
}
