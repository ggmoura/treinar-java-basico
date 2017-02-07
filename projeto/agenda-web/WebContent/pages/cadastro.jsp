<%@ page import="br.com.treinar.agenda.modelo.Sexo"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="a" uri="../WEB-INF/agenda.tld"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			Nome Usuario:&#160;&#160;<span id="nomeUsuario">${nomeUsuario}</span>
			<br /> <br /> <br />
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
					<td>Tipo Telefone</td>
					<td><a:tipo id="tipoTel" name="tipo" selecionado="Celular" /></td>
				</tr>
				<tr>
					<th align="left">E-Mail</th>
					<td><input id="email" name="email" type="text"></td>
				</tr>
				<tr>
					<th align="left">Sexo</th>
					<td><c:forEach items="${opcoesSexos}" var="sexo" varStatus="i">
							<input type="radio" name="sexo" value="${sexo}">
							<c:out value="${sexo.descricao}" /> ${i.index}
						</c:forEach> <%
 	// 							List<Sexo> sexos = (List<Sexo>) request.getServletContext().getAttribute("opcoesSexos");
 	// 							for(Sexo s : sexos) {
 	// 								out.println("<input name=\"sexo\" type=\"radio\" value=\"");
 	// 								out.print(s);
 	// 								out.print("\">");
 	// 								out.println(s.getDescricao());
 	// 							}
 %></td>
				</tr>
			</table>
			<input type="submit" value="Cadastrar"
				onclick="return validarCadastro()">
		</form>
	</div>
	<jsp:include page="/pages/rodape.jsp"/>
</body>
</html>