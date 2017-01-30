package br.com.treinar.agenda.test;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Test;

import br.com.treinar.agenda.modelo.Agenda;
import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Operadora;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.modelo.Telefone;

public class Teste {

	@Test
	public void teste() {
		
		EntityManager em = Persistence.createEntityManagerFactory("agenda").createEntityManager();
		Agenda a = new Agenda();
		a.setContatos(new ArrayList<>());

		Contato c = new Contato();
		c.setEmail("gleidson.gmoura@gmail.com");
		c.setAgenda(a);

		Telefone telefone = new Telefone();
		telefone.setDdd(31);
		telefone.setNumero(987749131);
		telefone.setOperadora(Operadora.OI);
		c.setTelefone(telefone);

		Pessoa p = new Pessoa();
		p.setDataNascimento(new Date());
		p.setNome("Maria Sophia Moura");
		p.setSexo(Sexo.F);

		c.setPessoa(p);
		c.setTelefone(telefone);

		a.getContatos().add(c);

		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
		Assert.assertNotEquals(a.getId(), Integer.valueOf(0));
	}
	
}
