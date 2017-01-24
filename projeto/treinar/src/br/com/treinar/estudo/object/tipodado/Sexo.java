package br.com.treinar.estudo.object.tipodado;

//Tipo de dado de dominio discreto
public enum Sexo {

	M("Masculino"), F("Feminino");
	
	private Sexo(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	

}
