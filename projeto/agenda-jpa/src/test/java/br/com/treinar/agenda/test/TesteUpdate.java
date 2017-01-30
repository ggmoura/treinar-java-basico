package br.com.treinar.agenda.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.agenda.modelo.Contato;

public class TesteUpdate {

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
		Contato contato = em.find(Contato.class, Long.valueOf(1));
		em.getTransaction().begin();
		System.out.println(contato.getEmail());
		contato.setEmail("editado@treinar.com");
		em.merge(contato);//altera o registo recuperado do banco de dados
		em.getTransaction().commit();
		Assert.assertEquals(contato.getEmail(), "editado@treinar.com");
	}

	
}
