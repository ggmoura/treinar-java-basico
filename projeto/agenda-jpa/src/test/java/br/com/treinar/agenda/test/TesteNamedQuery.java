package br.com.treinar.agenda.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.agenda.modelo.Agenda;

public class TesteNamedQuery {
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
	public void testeNamedQuery() {
		TypedQuery<Agenda> query = em.createNamedQuery("Agenda.buscarPeloNome", Agenda.class);
		query.setParameter("id", 1L);
		query.setMaxResults(100);
		Agenda a = query.getSingleResult();
		Assert.assertNotNull(a);
	}
	
}
