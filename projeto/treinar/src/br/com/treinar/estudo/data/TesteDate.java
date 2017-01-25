package br.com.treinar.estudo.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings({ "deprecation" })
public class TesteDate {

	public static void main(String[] args) throws Exception {
		Date hoje = new Date(1485292884756L);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(formatador.format(hoje));
		
		Date aniversario = new Date(1980, 11, 03);
		
		Date ontem = formatador.parse("23/01/2017");
		
		System.out.println(hoje.getTime());
		System.out.println(formatador.format(aniversario));
		System.out.println(formatador.format(ontem));
		
		Calendar c = Calendar.getInstance();
		System.out.println(formatador.format(c.getTime()));
		
		c.add(Calendar.DAY_OF_MONTH, -4);
		System.out.println(formatador.format(c.getTime()));
		
		c.set(Calendar.DAY_OF_MONTH, 03);
		c.set(Calendar.MONTH, 12);
		c.set(Calendar.YEAR, 1980);

		System.out.println(formatador.format(c.getTime()));
		
		
		Date agora = new Date();
		Long a = agora.getTime();
		Thread.sleep(3000);
		agora = new Date();
		Long b = agora.getTime();
		System.out.println((b - a) / 1000);
		
		
	}
	
}
