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
		//Método construtor da classe 
		//inicializa a lista de contatos do banco de dados Database.
		contatos = Database.getInstance().getContatos();
	}

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException {
		
		//Recupera os dados inseridos pelo usuário e salva em uma variável do tipo Contato.
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		String tipoTelefone = request.getParameter("tipo");
		
		//Se a validação do contato for executada com sucesso, cria-se o contato na linha 38,
		//senão a exceção 'AgendaException' sobe para quem chamou o método 'executar'.
		validarContato(nome, telefone, email, sexo, tipoTelefone);
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		contato.setSexo(Sexo.valueOf(sexo.trim()));
		contato.setTipoTelefone(TipoTelefone.valueOf(tipoTelefone));
		
		//Se o novo contato ainda não existe, o adiciona ao banco de dados.
		if (!contatos.contains(contato)) {
			contatos.add(contato);			
		}
		
		//Executa o método executar da classe ListaContatoCommand e retorna
		//o caminho que a requisição deve seguir. 
		ICommand lista = new ListaContatoCommand();
		return lista.executar(request, response);
	}
	
	private void validarContato(String nome, String telefone, 
								String email, String sexo,
								String tipoTelefone) throws AgendaException {
		
		//Verifica se todos os campos obrigatórios foram preenchidos pelo 
		//usuário (se estão diferentes de null) e ao final (linha 80) valida
		//o contato ou sobe uma exceção.
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
