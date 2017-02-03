package br.com.treinar.agenda.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.util.Database;

public class ListaContatoCommand implements ICommand {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contatos", Database.getInstance().getContatos());
		return "/pages/lista.jsp";
	}

}
