package br.com.treinar.agenda.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.modelo.TipoTelefone;

@ManagedBean(name = "agendaApplication")
public class ApplicationController {

	private List<TipoTelefone> tiposTelefones;

	@PostConstruct
	private void init() {
		tiposTelefones = new ArrayList<>(Arrays.asList(TipoTelefone.values()));
	}
	
	public List<TipoTelefone> getTiposTelefones() {
		return tiposTelefones;
	}

	public void setTiposTelefones(List<TipoTelefone> tiposTelefones) {
		this.tiposTelefones = tiposTelefones;
	}

}
