package servlets;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conectado!");
		connection.close();
	}
}