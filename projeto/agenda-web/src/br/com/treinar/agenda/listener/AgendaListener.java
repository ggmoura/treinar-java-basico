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
		System.out.println("Servidor finalizado");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		List<Sexo> sexos = Arrays.asList(Sexo.values());
		sce.getServletContext().setAttribute("opcoesSexos", sexos);
		System.out.println("Servidor inicializado");
	}

}
