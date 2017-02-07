package br.com.treinar.agenda.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.util.AgendaException;

public interface ICommand {

	String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException;
	
}
