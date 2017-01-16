package br.com.treinar.estudo.atividade;

public class AtividadeHora {

	public static void main(String[] args) {
		int minuto = 90;
		
		
		int hora =  minuto / 60;
		float horaF = (float) minuto / 60;
		
		float minutoReal = horaF - hora;
		System.out.println(minutoReal);
		System.out.println(minutoReal * 60);
		
		System.out.println(hora);
		
	
		System.out.println(minuto / 60);
		System.out.println(minuto % 60);
		
	}
	
}
