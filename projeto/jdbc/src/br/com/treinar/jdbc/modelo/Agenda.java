package br.com.treinar.jdbc.modelo;

import java.util.List;

public class Agenda extends Entity<Integer> {

	private List<Contato> contatos;

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
}
