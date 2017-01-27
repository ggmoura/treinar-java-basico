package br.com.treinar.jdbc;

import br.com.treinar.jdbc.dao.PessoaDAO;
import br.com.treinar.jdbc.modelo.Pessoa;

public class Teste2 {

	public static void main(String[] args) throws Exception {
		PessoaDAO dao = new PessoaDAO();
		Pessoa p = dao.reuperarPessoa(1L);
		System.out.println(p);
	}
	
}
