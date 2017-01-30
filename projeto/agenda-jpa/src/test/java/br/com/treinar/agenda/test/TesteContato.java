package br.com.treinar.agenda.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.agenda.modelo.Contato;


public class TesteContato {

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
	public void testeRecuperaContato() {
		Contato contato = recuperarContato();
		System.out.println(contato);
		Assert.assertNotNull(contato);
	}

	private Contato recuperarContato() {
		Contato c = em.find(Contato.class, Long.valueOf(1));
		return c;
	}
	
}
