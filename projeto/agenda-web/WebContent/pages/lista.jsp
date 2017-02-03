<%@ page import="br.com.treinar.agenda.modelo.Contato"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Contato</title>
</head>
<body>
	<div align="center">
		<form action="cadastro.maca">
			<input type="hidden" name="command" value="rem">
			<table>
				<tr>
					<th>Nome</th>
					<th>Telefone</th>
					<th>E-Mail</th>
					<th>Sexo</th>
					<th>Excluir</th>
				</tr>
				<% 
					List<Contato> contatos = (List<Contato>) request.getAttribute("contatos");
					for(Contato contato : contatos) {
						out.println("<tr>");
						
						out.println("<td>");
						out.print(contato.getNome());
						out.println("</td>");
						
						out.println("<td>");
						out.print(contato.getTelefone());
						out.println("</td>");
						
						out.println("<td>");
						out.print(contato.getEmail());
						out.println("</td>");
						
						out.println("<td>");
						out.print(contato.getSexo());
						out.println("</td>");
						
						out.println("<td>X</td>");
						out.println("</tr>");	
					}
				%>
			</table>
		</form>
	</div>

</body>
</html>