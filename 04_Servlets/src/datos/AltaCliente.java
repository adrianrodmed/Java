package datos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AltaCliente
 */
@WebServlet("/AltaCliente")
public class AltaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AltaCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String ciudad = request.getParameter("ciudad");
		String telefono = request.getParameter("telefono");
		String mail = request.getParameter("mail");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tienda";
			String user = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO clientes (nombre, ciudad, telefono, mail) VALUES (?,?,?,?)");
			ps.setString(1, nombre);
			ps.setString(2, ciudad);
			ps.setString(3, telefono);
			ps.setString(4, mail);
			ps.executeUpdate();
			System.out.println("Fila Insertada");
			
			ps.close();
			conn.close();;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
