<%@ page session=false; language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Ejemplo en JSP</h2>
		<%= new java.util.Date() %>	<br>
		<%= request.getRemoteHost() %> <br>
		<%--= session.getId() --%> <hr> <!-- No funciona porque hemos quitado la session en el @page -->
		<h3>Scriptlets</h3>
		<%
		int numero = 5;
		if(numero >= 4){
			System.out.println("Has elegido un número alto.");
			out.println("<p> Número alto </p>");}
		else{
			System.out.println("Has elegido un número bajo");
			out.println("<p> Número bajo </p>");}
		%><hr>
		<h3>Añadir Cookies</h3>
		<%--
		String cookies;
		out.println("Cookies");
		/*--String oldID =
			ServletUtilities.getCookieValue(cookies, "userID", NO_VALUE);
		String newID;
		if (oldID.equals(NO_VALUE)) {
			newID = randomID();}
		else {
			newID = oldID;
			}
		LongLivedCookie cookie = new LongLivedCookie("userID", newID);
		response.addCookie(cookie);
		--%>
		<hr>
		<h3>Manejo de sesiones</h3>
		<%
		javax.servlet.http.HttpSession misession= request.getSession(true);
		%>
	</body>
</html>