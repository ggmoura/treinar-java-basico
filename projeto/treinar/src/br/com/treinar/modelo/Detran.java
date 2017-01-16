package br.com.treinar.modelo;

public class Detran {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.nome = "gol";
		c.ano = 2017;
		
		Placa placa = new Placa();
		placa.letras = "HDD";
		placa.numero = 0004;
		
		c.placa = placa;
		
		
		
		System.out.println(c.placa.letras);
		c.placa.numero = 6548;
		
		System.out.println(placa.numero);
;
		
	}
	
}
