package database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Usuario;
import database.Conexao;

public class Operacao {
	
	public void adicionarUsuario(Usuario usuario) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		
		//String query = "insert into usuario (nome, email, senha) values(" + usuario.getNome() + ", " + usuario.getEmail() + ", " + usuario.getSenha() + ")";
		
		Conexao conexao = new Conexao();
		//PreparedStatement ps = conn.getPreparedStatement(conn.getConnection(), query);
		//ps.executeQuery();
		
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO USUARIO");
		sql.append(" (nome, email, senha) values (?,?,?)");
		PreparedStatement statement =  conexao.getPreparedStatement(conexao.getConnection(), sql.toString());
		statement.setString(1, usuario.getNome());
		statement.setString(2, usuario.getEmail());
		statement.setString(3, usuario.getSenha());
		int resultSet = statement.executeUpdate();
		
	}

}
