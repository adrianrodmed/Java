package db1;

import java.sql.*;

public class Insertar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/tienda";
		String user = "root";
		String password = "";
		Connection conn = DriverManager.getConnection(url, user, password);
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO clientes (nombre, ciudad) VALUES (?,?)");
		ps.setString(1, "Adrián");
		ps.setString(2, "Madrid");
		ps.executeUpdate();
		System.out.println("Fila Insertada");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM clientes");
		
		while (rs.next()) {
			String name = rs.getString("Nombre");
			String city = rs.getString("Ciudad");
			System.out.println("Soy " + name + " y vivo en " + city);}
		
		ps.close();
		rs.close();
		stmt.close();
		conn.close();
	}

}
