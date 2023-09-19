package br.com.douglas.serverfaces.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.douglas.serverfaces.bean.Filme;

public class FilmeDAO {
	private Connection bd;

	public FilmeDAO(Connection bd) {
		this.bd = bd;
	}

	public void inserir(Filme filme) throws SQLException {
		String sql = "insert into filme (nome, valor, status, genero) values(?,?,?,?)";

		PreparedStatement comando = bd.prepareStatement(sql);
		comando.setString(1, filme.getNome());
		comando.setDouble(2, filme.getValor());
		comando.setInt(3, filme.getStatus());
		comando.setString(4, filme.getGenero());

		comando.execute();
	}
	
	public List<Filme> listar() throws SQLException{
		return null;
	}
}
