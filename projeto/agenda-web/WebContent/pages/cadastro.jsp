<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Contato</title>
</head>
<body>
	<div align="center">
		<form action="cadastro.maca">
			<input type="hidden" id="command" name="command" value="cad">
			<table style="width: 100%">
				<tr>
					<th align="left">Nome</th>
					<td><input name="nome" type="text"></td>
				</tr>
				<tr>
					<th align="left">Telefone</th>
					<td><input name="telefone" type="text"></td>
				</tr>
				<tr>
					<th align="left">E-Mail</th>
					<td><input name="email" type="text"></td>
				</tr>
				<tr>
					<th align="left">Sexo</th>
					<td><input name="sexo" type="text"></td>
				</tr>
			</table>
			<input type="submit" value="Cadastrar">
		</form>
	</div>

</body>
</html>