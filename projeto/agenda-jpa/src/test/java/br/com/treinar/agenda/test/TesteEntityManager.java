package br.com.treinar.agenda.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TesteEntityManager {

	private EntityManager em;

	@Before
	public void before() {
		em = Persistence.createEntityManagerFactory("agenda").createEntityManager();
	}
	
	@After
	public void after() {
		em.clear();
	}
	
	@Test
	public void test() {
		Assert.assertNotNull(em);
	}

}
