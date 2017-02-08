package br.com.treinar.agenda.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.util.Database;

@ManagedBean(name = "helloWorld")
public class TesteController {

	private Contato contato;

	public TesteController() {
		contato = new Contato();
		contato.setTelefone(new Telefone());
		contato.getTelefone().setDdd(31);
		contato.getTelefone().setNumero(987749131);
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
	}

}
