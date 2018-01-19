package basico;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Consultar
 */
@WebServlet("/Consultar")
public class Consultar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consultar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		System.out.println("El Método doGet Funciona");
		//getServletConfig().getServletContext().getRequestDispatcher("/leer.jsp").forward(request, response); /*Esto es para volver a la misma página o la que queramos estando en el servlet*/
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/periodico", "root", "");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM noticias");
			String resultado = "";
			resultado += "<table class=\"bordered\"> <td>e-Mail</td> <td>Titulo</td> <td>Contenido</td> <td>Fecha</td>";
			while(rs.next()) {
				System.out.println(rs.getString(4));
				resultado += "<tr>";
				resultado += "<td width=\"15%\">";
				resultado += rs.getString(2);
				resultado += "</td>";
				resultado += "<td width=\"30%\">";
				resultado += rs.getString(4);
				resultado += "</td>";
				resultado += "<td width=\"40%\">";
				resultado += rs.getString(5);
				resultado += "</td>";
				resultado += "<td width=\"15%\">";
				resultado += rs.getString(6);
				resultado += "</td>";
				resultado += "</tr>";
			}
			resultado += "</table>";
			request.getSession().setAttribute("servletMsg1", resultado);
			response.sendRedirect("leer.jsp"); /*Esto es para volver a la misma página o la que queramos estando en el jsp*/
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*finally {
			if(out != null)
				out.close();
		}*/
		
	}

}
