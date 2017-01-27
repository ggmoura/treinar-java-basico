package br.com.treinar.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
// jdbc:mysql://localhost:3306/agenda string de conexao conecta na porta 3306,
// este valor pode ser omitido caso o banco esteja na porta padra 3306 no caso
// do mysql

// Caso seja necessario fazer uma conexao em outra maquina deve trocar a palavra
// localhost pelo ip da maquina onde o banco de dados esta instalado