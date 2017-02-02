package br.com.arqbox.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(value = "/HelloWorld", loadOnStartup = 1) //loadOnStartup define que o servlet serah carregado assim que o servidor inicializar
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private String afilhadaMaisLinda;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	@Override
	public void init() throws ServletException {
		afilhadaMaisLinda = "Maria Sophia";
	}

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served Get at: ").append(request.getContextPath())
				.append("<h1>" + afilhadaMaisLinda + "</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served Post at: ").append(request.getContextPath())
		.append("<h1>" + afilhadaMaisLinda + "</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("good by...");
	}
	
}
