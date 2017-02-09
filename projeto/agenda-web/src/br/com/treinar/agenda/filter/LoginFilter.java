package br.com.treinar.agenda.filter;

import java.io.IOException;
import java.util.Random;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */

//@WebFilter é uma anotação que avisa o servidor que essa classe é um filtro,
//ou seja, filtra alguma informação e valida ou não.
@WebFilter(dispatcherTypes = {
		
		//É possível implementar o filtro para essas quatro situações:
				DispatcherType.REQUEST, //requisição
				DispatcherType.FORWARD, //saindo do servidor
				DispatcherType.INCLUDE, //inclusão
				DispatcherType.ERROR    //erro
		}
					, urlPatterns = { "/*" }, servletNames = { "ServletController" })
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//convertendo ServletRequest em HttpServletRequest
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		//recuperando objeto da sessao
//		Object nomeUsuario = httpServletRequest.getSession().getAttribute("nomeUsuario");
//		String uri = httpServletRequest.getRequestURI();
//		if (nomeUsuario != null || uri.contains("index.jsp")) {
			chain.doFilter(request, response);
//		} else {
//			httpServletResponse.sendRedirect("http://localhost:8080/agenda-web/index.jsp");
//		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
