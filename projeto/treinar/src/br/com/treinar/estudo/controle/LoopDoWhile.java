package br.com.treinar.estudo.controle;

import javax.swing.JOptionPane;

public class LoopDoWhile {

	public static void main(String args[]) {
		int x = 10;
		String result = "";
		do {
			result += "value of x : " + x + "\n";
			x++;
			//System.out.print("\n");
		} while (x < 20);
		JOptionPane.showMessageDialog(null, result, "Titulo Alert", 1);
	}
}