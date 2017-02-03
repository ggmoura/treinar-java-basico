package br.com.treinar.agenda.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.util.Database;

public class CriaContatoCommand implements ICommand {

	private List<Contato> contatos;
	
	public CriaContatoCommand() {
		contatos = Database.getInstance().getContatos();
	}

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		contato.setSexo(Sexo.valueOf(sexo));
		
		if (!contatos.contains(contato)) {
			contatos.add(contato);			
		}
		ICommand lista = new ListaContatoCommand();
		return lista.executar(request, response);
	}

}
