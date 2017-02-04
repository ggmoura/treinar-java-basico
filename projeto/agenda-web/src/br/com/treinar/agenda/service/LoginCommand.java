package br.com.treinar.agenda.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements ICommand {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nomeUsuario");
		request.getSession().setAttribute("nomeUsuario", nome);
		
		return "/index.jsp";
	}

}
