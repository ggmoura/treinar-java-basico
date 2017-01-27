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


//create table pessoa ( id BIGINT NOT NULL AUTO_INCREMENT, nome VARCHAR(255), sexo int, dataNascimento DATE, primary key (id) )