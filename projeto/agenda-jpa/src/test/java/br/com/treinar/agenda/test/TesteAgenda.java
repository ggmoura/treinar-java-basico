package br.com.treinar.agenda.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

//import org.hibernate.Hibernate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.agenda.modelo.Agenda;


public class TesteAgenda {

	private EntityManager em;
	
	@Before
	public void before() {
		em = Persistence.createEntityManagerFactory("agenda").createEntityManager();
	}
	
	@After
	public void after() {
		em.close();
	}
	
	@Test
	public void testeRecuperaAgenda() {
		Agenda agenda = recuperarAgenda(Long.valueOf(1L));
		try {
			System.out.println(agenda.getContatos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertNotNull(agenda);
	}

	private Agenda recuperarAgenda(Long id) {
		Agenda c = em.find(Agenda.class, id);
		return c;
	}
	
	public Agenda recuperarAgendaLazy() {
		Agenda c = recuperarAgenda(Long.valueOf(1));
		return c;
	}
	
	public Agenda recuperarAgendaEager() {
		Agenda c = recuperarAgenda(Long.valueOf(1));
		//Hibernate.initialize(c.getContatos());
		em.close();
		return c;
	}
	

	
}
