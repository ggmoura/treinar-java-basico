package br.com.treinar.agenda.modelo;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(value = { 
	@NamedQuery(name=Contato.ConstanteContato.RECUPERAR_NOME_EMAIL_KEY, query=Contato.ConstanteContato.RECUPERAR_NOME_EMAIL_QUERY)
})
@Entity
public class Contato {

	public Contato(String nome, String email) {
		this();
		this.pessoa = new Pessoa();
		this.pessoa.setNome(nome);
		this.email = email;
	}
	
	public Contato() {
		super();
	}
	
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Pessoa pessoa;

	@ManyToOne(cascade = { CascadeType.ALL })
	private Telefone telefone;

	@ManyToOne
	private Agenda agenda;

	@Column(name = "e_mail")
	private String email;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	public interface ConstanteContato {
		String RECUPERAR_NOME_EMAIL_KEY = "Contato.recuperarNomeEmail";
		String RECUPERAR_NOME_EMAIL_QUERY = "select new br.com.treinar.agenda.modelo.Contato(c.pessoa.nome, c.email) from Contato c";
	}

}
