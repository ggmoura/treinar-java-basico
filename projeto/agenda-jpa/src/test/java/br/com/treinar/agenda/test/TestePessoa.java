package br.com.treinar.agenda.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;


public class TestePessoa {

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
	public void testePersistPessoa() {
		Pessoa p = new Pessoa();
		p.setDataNascimento(new Date());
		p.setNome("Maria Sophia");
		p.setSexo(Sexo.F);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		Assert.assertNotNull(recuperarPessoa());
	}

	private Pessoa recuperarPessoa() {
		Pessoa p = em.find(Pessoa.class, Long.valueOf(1));
		return p;
	}
	
}
