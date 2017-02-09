package br.com.treinar.agenda.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.modelo.TipoTelefone;

@ManagedBean(name = "agendaApplication")
@ApplicationScoped
public class ApplicationController {

	private List<TipoTelefone> tiposTelefones;
	private List<Sexo> sexos;

	@PostConstruct
	private void init() {
		tiposTelefones = new ArrayList<>(Arrays.asList(TipoTelefone.values()));
		sexos = new ArrayList<>(Arrays.asList(Sexo.values()));
	}

	public List<TipoTelefone> getTiposTelefones() {
		return tiposTelefones;
	}

	public void setTiposTelefones(List<TipoTelefone> tiposTelefones) {
		this.tiposTelefones = tiposTelefones;
	}

	public List<Sexo> getSexos() {
		return sexos;
	}

	public void setSexos(List<Sexo> sexos) {
		this.sexos = sexos;
	}

}
