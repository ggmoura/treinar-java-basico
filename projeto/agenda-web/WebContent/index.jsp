<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Agenda Treinar</title>
	<script type="text/javascript" src="js/agenda.js"></script>
</head>
<body>

	<form action="menu.maca">
		<input type="hidden" name="command" id="command" value="">
		
		Informe seu nome: <input type="text" name="nomeUsuario" value="${nomeUsuario}">
		<input type="submit" value="Logar" onclick="setCommand('lga')" >
		<br /><br />
		
		<input type="submit" value="Cadastrar" onclick="setCommand('acs')" >
		<input type="submit" value="Listar" onclick="setCommand('lis')">
	</form>
	
</body>
</html>