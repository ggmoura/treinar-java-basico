package br.com.treinar.agenda.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;

public class Database {
	// Essa classe segue o padrão de projeto Singleton, que permite criar
	// um objeto único dessa classe, ou seja, uma instância estática.
	// Nesse caso, a lista de contatos será única no banco de dados.

	private List<Contato> contatos;

	private static Database instance;

	static {
		instance = new Database();
	}

	public static Database getInstance() {
		return instance;
	}

	private Database() {
		super();
		contatos = new ArrayList<>();
	}

	public List<Contato> getContatos() {
		return contatos;
	}

}
