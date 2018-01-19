package basico;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Add() {
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
		String mail = request.getParameter("mail");
		int categoria = Integer.parseInt(request.getParameter("idcategoria"));
		String titulo = request.getParameter("titulo");
		String contenido = request.getParameter("contenido");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/periodico";
			String user = "root";
			String password = "";
			Connection conn = DriverManager.getConnection(url, user, password);

			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO noticias (mail, idcategoria, titulo, contenido) VALUES (?,?,?,?)");
			ps.setString(1, mail);
			ps.setInt(2, categoria);
			ps.setString(3, titulo);
			ps.setString(4, contenido);
			ps.executeUpdate();
			System.out.println("Fila Insertada");

			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
