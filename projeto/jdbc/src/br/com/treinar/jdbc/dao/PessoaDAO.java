package br.com.treinar.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.treinar.jdbc.ConnectionFactory;
import br.com.treinar.jdbc.modelo.Pessoa;

public class PessoaDAO {

	public void inserirPessoa(Pessoa pessoa) {
		String sql = "insert into pessoa " + "(nome, dataNascimento, sexo)" + " values (?, ?, ?)";
		Connection conn = new ConnectionFactory().getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setDate(2, new Date(pessoa.getDataNascimento().getTime()));
			stmt.setInt(3, pessoa.getSexo().ordinal());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
