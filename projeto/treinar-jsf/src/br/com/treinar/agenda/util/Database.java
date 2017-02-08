package br.com.treinar.agenda.util;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;

public class Database {

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
