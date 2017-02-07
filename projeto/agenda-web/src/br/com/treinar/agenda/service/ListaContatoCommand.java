package br.com.treinar.agenda.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;
import br.com.treinar.agenda.util.Database;

public class ListaContatoCommand implements ICommand {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException {
		
		List<Contato> contatos = Database.getInstance().getContatos();
		if (!contatos.isEmpty()) {
			request.setAttribute("contatos", contatos);
			return "/pages/lista.jsp";			
		} else {
			throw new AgendaException("Nenhum contato cadastrado");
		}
	}

}
