package br.com.arqbox.servlet;

// Import required java libraries
import java.io.*;
import java.util.Arrays;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(value="/jadine")
public class HelloForm extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Using GET Method to Read Form Data";

		String docType = "<!doctype html\">\n";

		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "  <li><b>First Name</b>: " + request.getParameter("nome") + "\n" + "  <li><b>Last Name</b>: "
				+ request.getParameter("sobrenome") + "\n" + "</ul>\n" + 
				"<ul>\n" +
				"  <li><b>Maths Flag : </b>: "
				+ request.getParameter("maths") + "\n" +
				"  <li><b>Physics Flag: </b>: "
				+ request.getParameter("physics") + "\n" +
				"  <li><b>Chemistry Flag: </b>: "
				+ request.getParameter("chemistry") + "\n" +
				"  <li><b>Frutas: </b>: "
				+ Arrays.asList(request.getParameterValues("fruta")) + "\n" +
				"</ul>\n" +
				
				
				"</body></html>");
	}
}