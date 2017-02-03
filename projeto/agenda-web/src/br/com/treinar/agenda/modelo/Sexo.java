package br.com.treinar.agenda.modelo;

public enum Sexo {

	FEMININO("Feminino"),
	MASCULINO("Masculino"),
	INDIFERENTE("Indiferente");
	
	private Sexo(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

}
