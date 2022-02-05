package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	static final String url = "jdbc:mysql://localhost:3306/escola";   //Caminho ao banco de dados
	static final String user = "root";   //Nome do usuário que quer acessar
	static final String password = "admin";  //Senha do usuário (essa é a minha senha, pode nao ser a sua)
	static Connection con = null;
	
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}
	
	public static Connection fecharConexao() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}