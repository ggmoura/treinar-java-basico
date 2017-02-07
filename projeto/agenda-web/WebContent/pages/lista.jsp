<%@ page import="br.com.treinar.agenda.modelo.Contato"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<table border="1">
				<tr>
					<th>Linha</th>
					<th>Nome</th>
					<th>Telefone</th>
					<th>Tipo Telefone</th>
					<th>E-Mail</th>
					<th>Sexo</th>
					<th>Excluir</th>
				</tr>
				<c:forEach items="${contatos}" var="contato" varStatus="i">
					<tr>
						<td>${i.index}</td>
						<td>${contato.nome}</td>
						<td>${contato.telefone}</td>
						<td>${contato.tipoTelefone.descricao}</td>
						<td>${contato.email}</td>
						<td>${contato.sexo.descricao}</td>
						<td><input type="submit" value="Excluir"></td>
					</tr>
				</c:forEach>
			</table>
			
			<a href="<%=request.getContextPath() %>/cadastro.maca?command=acs">Cadastrar</a>
		</form>
	</div>
	<jsp:include page="/pages/rodape.jsp"/>
</body>
</html>