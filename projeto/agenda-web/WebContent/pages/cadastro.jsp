<%@page import="br.com.treinar.agenda.modelo.Sexo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro Contato</title>
	<script type="text/javascript" src="js/agenda.js"></script>
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
					<td><input id="email" name="email" type="text"></td>
				</tr>
				<tr>
					<th align="left">Sexo</th>
					<td>
						<%
							List<Sexo> sexos = (List<Sexo>) request.getAttribute("opcoesSexos");
							for(Sexo s : sexos) {
								out.println("<input name=\"sexo\" type=\"radio\" value=\"");
								out.print(s);
								out.print("\">");
								out.println(s.getDescricao());
							}
						%>
					</td>
				</tr>
			</table>
			<input type="submit" value="Cadastrar" onclick="return validarCadastro()">
		</form>
	</div>

</body>
</html>