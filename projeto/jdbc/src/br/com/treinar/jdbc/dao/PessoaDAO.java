package br.com.treinar.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.treinar.jdbc.ConnectionFactory;
import br.com.treinar.jdbc.modelo.Pessoa;
import br.com.treinar.jdbc.modelo.Sexo;

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

	public Pessoa reuperarPessoa(Long id) throws Exception {
		String sql = "select p.dataNascimento, p.id, p.nome, p.sexo from Pessoa p where p.id = ?";
		Connection conn = new ConnectionFactory().getConnection();
		Pessoa p = null;
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				p = new Pessoa();
				p.setNome(rs.getString("nome"));
				p.setId(rs.getLong("id"));
				p.setSexo(Sexo.values()[rs.getInt("sexo")]);
				p.setDataNascimento(new java.util.Date(rs.getDate("sexo").getTime()));
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			
		}
		if (p == null) {
			throw new Exception();
		}
		return p;
	}

}
