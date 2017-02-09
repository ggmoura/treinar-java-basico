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

//@WebServlet avisa o servidor que essa classe é do tipo Servlet e que qualquer 
//URL terminada com '.maca' terá que passar por essa parte do código.
@WebServlet("*.maca")
public class ServletController extends HttpServlet {
	//Servlet é uma classe java que estende funcionalidades de um servidor de aplicação.
	//Espera a requisição para tratá-la e retorná-la ao servidor.

	private static final long serialVersionUID = 1L;

	private Map<String, String> comandos;

	@Override
	public void init() throws ServletException {
		//init -> é chamado e executado uma única vez, inicializando o objeto do
		//servlet que fica aguardando as requisições.
		comandos = new HashMap<>();
		comandos.put("cad", "br.com.treinar.agenda.service.CriaContatoCommand");
		comandos.put("rem", "br.com.treinar.agenda.service.RemoveContatoCommand");
		comandos.put("acs", "br.com.treinar.agenda.service.AcessaTelaContatoCommand");
		comandos.put("lis", "br.com.treinar.agenda.service.ListaContatoCommand");
		comandos.put("lga", "br.com.treinar.agenda.service.LoginCommand");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = comandos.get(request.getParameter("command"));
		//A linha 45 recupera a requisição e compara com as chaves do HashMap, salvando em 
		//'command' o caminho exato que a requisição deve seguir.
		
		try {
			
			//Cria-se uma instância da classe salva em 'command' e faz um casting para ICommand;
			//chama o metódo executar da classe e salva em 'goTo' o novo caminho que a requisição
			//deve seguir; por fim, na linha 52, direciona a requisição para o lugar desejado.
			
			ICommand c = (ICommand) Class.forName(command).newInstance();
			String goTo = c.executar(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher(goTo);
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
