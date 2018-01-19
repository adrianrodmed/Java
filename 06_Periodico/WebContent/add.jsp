<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<!--Import Google Icon Font-->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<!--Import materialize.css-->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
		<!--Let browser know website is optimized for mobile-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body style="text-align: center; background-color: #FFACC4;">
		<h2 style="font-size: 6em;">Añadir</h2>
		<div class="row">
			<form class="col s12" action="Add" method="post">
				<div class="row">
					<div class="input-field col s12">
						<input style="text-align: center;" placeholder="Mail" id="email" name="mail" type="email" class="validate">
						<label style="color: black; font-size: 1.25em;" for="mail">e-Mail</label>
						</div>
					<div class="input-field col s12">
						<select name="idcategoria">
							<option style="text-align: center;" value="" disabled selected>Elige categoria</option>
							<option style="text-align: center;" value="1">Deportes</option>
							<option style="text-align: center;" value="2">Cultura</option>
							<option style="text-align: center;" value="3">Economia</option>
						</select>
					</div>
					<div class="input-field col s12">
						<input style="text-align: center;" placeholder="Título" id="titulo" name="titulo" type="text" class="validate">
						<label style="color: black; font-size: 1.25em; for="titulo">Título</label>
					</div>
					<div class="input-field col s12">
						<input style="text-align: center;" placeholder="Contenido" id="contenido" name="contenido" type="text" class="validate">
						<label style="color: black; font-size: 1.25em; for="contenido">Contenido</label>
					</div>
					<button class="btn waves-effect waves-light" type="submit" name="action">Enviar Consulta
						<i class="material-icons right">send</i>
					</button>
				</div>
			</form>
  </div>
  <hr>
		<!--Import jQuery before materialize.js-->
		<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
		<script type="text/javascript">$(document).ready(function() {
		    $('select').material_select();
		  });</script>
	</body>
</html>