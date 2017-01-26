package br.com.treinar.agenda.view;

import java.sql.Connection;

import br.com.treinar.agenda.dao.ConnectionFactory;

public class TestaConnection {

	public static void main(String[] args) throws Exception {
		Connection c = new ConnectionFactory().getConnection();
		c.close();
		System.out.println("conectou");
	}
	
}
