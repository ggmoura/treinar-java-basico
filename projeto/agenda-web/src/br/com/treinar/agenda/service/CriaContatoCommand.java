package br.com.treinar.agenda.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.agenda.util.AgendaException;
import br.com.treinar.agenda.util.Database;

public class CriaContatoCommand implements ICommand {

	private List<Contato> contatos;
	
	public CriaContatoCommand() {
		contatos = Database.getInstance().getContatos();
	}

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException {
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		String tipoTelefone = request.getParameter("tipo");
		validarContato(nome, telefone, email, sexo, tipoTelefone);
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		contato.setSexo(Sexo.valueOf(sexo.trim()));
		contato.setTipoTelefone(TipoTelefone.valueOf(tipoTelefone));
		
		if (!contatos.contains(contato)) {
			contatos.add(contato);			
		}
		ICommand lista = new ListaContatoCommand();
		return lista.executar(request, response);
	}
	
	private void validarContato(String nome, String telefone, 
								String email, String sexo,
								String tipoTelefone) throws AgendaException {
		StringBuilder camposObrigatorios = new StringBuilder();
		if (nome == null) {
			camposObrigatorios.append(" Nome").append(" ");
		}
		if (telefone == null) {
			camposObrigatorios.append(" Telefone").append(" ");
		}
		if (sexo == null) {
			camposObrigatorios.append(" Sexo").append(" ");
		}
		if (email == null) {
			camposObrigatorios.append(" Email").append(" ");
		}
		if (tipoTelefone == null) {
			camposObrigatorios.append(" Tipo Telefone").append(" ");
		}
		if (camposObrigatorios.length() > 0) {
			throw new AgendaException(camposObrigatorios.toString());
		}
		
	}

}
