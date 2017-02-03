package br.com.treinar.agenda.service;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Sexo;

public class AcessaTelaContatoCommand implements ICommand {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		List<Sexo> sexos = Arrays.asList(Sexo.values());
		request.setAttribute("opcoesSexos", sexos);
		return "/pages/cadastro.jsp";
	}

}
