package br.com.treinar.agenda.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@NamedQueries(value = { 
	@NamedQuery(name="Agenda.buscarPeloNome", query="select a from Agenda a where a.id = :id"),
	@NamedQuery(name="Agenda.buscarPeloId", query="select a from Agenda a where a.id = :id")
})
@Entity // define que serah uma tabela do banco de dados
@Table(name = "tb_agenda") // opcional, quando necessario muda o nome da agenda
public class Agenda {

	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Contato> contatos;

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
