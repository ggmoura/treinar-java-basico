package br.com.treinar.agenda.listener;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.treinar.agenda.modelo.Sexo;

/**
 * Application Lifecycle Listener implementation class AgendaListener
 *
 */

//@WebListener é uma anotação e informa que essa classe é um listener, ou seja, 
//ela aguarda algum evento específico para realizar algum comando.
@WebListener
public class AgendaListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public AgendaListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		//Quando o servidor está sendo desligado, esse método é chamado e
		//é capaz de avisar ao usuário que o servidor está finalizando.
		System.out.println("Servidor finalizado");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		//Quando o servidor está iniciando, esse método é chamado e
		//já organiza e atualiza toda a lista de sexos logo no início
		//da aplicação, para que todos os usuários tenham acesso e para
		//que a lista de sexos não precise se atualizar a cada requisição.
		List<Sexo> sexos = Arrays.asList(Sexo.values());
		sce.getServletContext().setAttribute("opcoesSexos", sexos);
		System.out.println("Servidor inicializado");
	}

}
