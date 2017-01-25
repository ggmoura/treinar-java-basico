package br.com.treinar.estudo.tratamentoexcecao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.treinar.estudo.object.Pessoa;

public class TestEexception {

	
	public static void main(String[] args) throws Exception {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe o dia do seu nascimento: ");
		Integer dia = null;
		Integer[] array = new Integer[1];
		//tratamento de exceção
		try {//este bloco eh executado ateh o final se nao ocorrer um erro
			dia = leitor.nextInt();
			System.out.println("Você nasceu dia: " + dia);
			array[1] = dia;
			DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			formatador.parse("oi");
			System.out.println("fez tudo");
		} catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Não eh um numero " + e.getClass().getSimpleName());
		} catch (Exception e) {
			System.out.println("Erro desconhecido");
		} finally {//este codigo serah executado indiferente do bloco executado ou seja, se entrar se entrar no try ou no catch
			leitor.close();
		}
		
		try (Scanner leitor2 = new Scanner(System.in)) {
			
		}
		
	}
}
