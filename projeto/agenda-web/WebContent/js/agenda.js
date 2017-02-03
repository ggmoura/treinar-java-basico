'use strict'

//Onde posso aprender javascrit com tranquilidade... depois angular js
//https://www.youtube.com/playlist?list=PLQCmSnNFVYnT1-oeDOSBnt164802rkegc

function setCommand(command) {
	var cmd = document.getElementById('command');
	cmd.value = command;
}

function validarCadastro() {
	var email = document.getElementById('email').value;
	//podemos pegar um elemento da tela a partir do nome, porem,
	//podem haver muitos elementos com o mesmo nome, o ideal é 
	//recuperar um elemento a partir do id que é unico no formulario
	var telefone = document.getElementsByName('telefone')[0].value;
	var retorno = true;
	var msg = '';
	if (email.indexOf('@') == -1) {
		msg = 'Email invalido ou nao informado	';
		retorno = false;
	}
	if (telefone.length == 0) {
		msg += '\nTelefone obrigatorio';
		retorno = false;
	}
	
	if (!retorno) {
		alert(msg);
	}
	
	return retorno;
}