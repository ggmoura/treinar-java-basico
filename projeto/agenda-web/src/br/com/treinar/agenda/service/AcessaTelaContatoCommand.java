package br.com.treinar.agenda.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AcessaTelaContatoCommand implements ICommand {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		
		return "/pages/cadastro.jsp";
	}

}
