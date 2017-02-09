package br.com.treinar.agenda.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.agenda.util.AgendaException;

public interface ICommand {
	// Interface que será implementanda em todas as classe do pacote service,
	// portanto o método executar terá que ser obrigatoriamente implementado em
	// todas.

	String executar(HttpServletRequest request, HttpServletResponse response) throws AgendaException;

	// request -> variável criada pelo servidor; contém todas as informações
	// da requisição; também é usada para transmitir dados necessários dentro
	// do servidor, em outras palavras, permite "comunicação" entre as classes
	// do pacote service.

	// response -> variável criada pelo servidor que produz algo para o usuário,
	// como uma página HTML, ou seja, a 'resposta' do servidor.
}
