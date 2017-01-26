package br.com.treinar.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql//localhost/agenda", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
// jdbc:mysql://localhost:3306/agenda string de conexao conecta na porta 3306,
// este valor pode ser omitido caso o banco esteja na porta padra 3306 no caso
// do mysql