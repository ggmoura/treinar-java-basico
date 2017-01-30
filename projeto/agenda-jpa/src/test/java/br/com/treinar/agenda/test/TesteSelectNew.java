package br.com.treinar.agenda.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.treinar.agenda.modelo.Agenda;
import br.com.treinar.agenda.modelo.Contato;

public class TesteSelectNew {
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
		TypedQuery<Contato> query = em.createNamedQuery(Contato.ConstanteContato.RECUPERAR_NOME_EMAIL_KEY, Contato.class);
		query.setMaxResults(100);
		List<Contato> contatos = query.getResultList();
		Assert.assertNotEquals(contatos.size(), 0);
	}
	
}
