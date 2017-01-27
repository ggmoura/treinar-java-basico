package br.com.treinar.jdbc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import br.com.treinar.jdbc.dao.PessoaDAO;
import br.com.treinar.jdbc.modelo.Pessoa;
import br.com.treinar.jdbc.modelo.Sexo;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Scanner leitor = new Scanner(System.in);
		Pessoa p = new Pessoa();
		System.out.print("Informe o nome: ");
		p.setNome(leitor.nextLine());
		System.out.print("Informe M (Masculino) ou F (Feminino): ");
		p.setSexo(Sexo.valueOf(leitor.nextLine()));
		System.out.print("Informe a data de nascimento (dd/mm/yyyy): ");
		p.setDataNascimento(df.parse(leitor.nextLine()));
		leitor.close();
		
		PessoaDAO dao = new PessoaDAO();
		dao.inserirPessoa(p);
		System.out.println("Pessoa gravada com sucesso!");
	}
	
}
