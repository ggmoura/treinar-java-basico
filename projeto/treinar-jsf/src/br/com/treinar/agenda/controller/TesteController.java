package br.com.treinar.agenda.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Tela;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.util.Database;

@ViewScoped
@ManagedBean(name = "helloWorld")
public class TesteController {

	private Contato contato;
	private Tela tela;

	@PostConstruct
	public void init() {
		//FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("en", "US"));
		contato = new Contato();
		contato.setTelefone(new Telefone());
		tela = Tela.LISTAGEM;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public void salvar() {
		Database.getInstance().getContatos().add(contato);
		FacesMessage facesMessage = new FacesMessage("Contato salvo com sucesso...");
		FacesContext.getCurrentInstance().addMessage("sucesso", facesMessage);
		tela = Tela.LISTAGEM;
	}

	public List<Contato> getContatos() {
		return Database.getInstance().getContatos();
	}
	
	public void novoContato() {
		contato = new Contato();
		contato.setTelefone(new Telefone());
		tela = Tela.EDICAO;
	}

	public Tela getTela() {
		return tela;
	}

	public void setTela(Tela tela) {
		this.tela = tela;
	}
	
	public void editar(Contato contato) {
		this.contato = contato;
		tela = Tela.EDICAO;		
	}

}
