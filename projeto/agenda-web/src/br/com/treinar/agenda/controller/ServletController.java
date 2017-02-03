package br.com.treinar.agenda.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.service.ICommand;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("*.maca")
public class ServletController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Map<String, String> comandos;

	@Override
	public void init() throws ServletException {
		comandos = new HashMap<>();
		comandos.put("cad", "br.com.treinar.agenda.service.CriaContatoCommand");
		comandos.put("rem", "br.com.treinar.agenda.service.RemoveContatoCommand");
		comandos.put("acs", "br.com.treinar.agenda.service.AcessaTelaContatoCommand");
		comandos.put("lis", "br.com.treinar.agenda.service.ListaContatoCommand");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = comandos.get(request.getParameter("command"));
		try {
			ICommand c = (ICommand) Class.forName(command).newInstance();
			String goTo = c.executar(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher(goTo);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
