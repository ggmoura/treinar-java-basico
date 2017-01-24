package br.com.treinar.estudo.object;

import br.com.treinar.estudo.object.tipodado.Sexo;

public class Pessoa implements Comparable<Pessoa> {

	private Integer idade;
	private String nome;
	private Sexo sexo;

	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, Integer idade, Sexo sexo) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	//metodo compareTo, definido na interface Comparable, utilizado na ordenacao <b>OBRIGATORIO</b>
	@Override
	public int compareTo(Pessoa o) {
		return this.idade.compareTo(o.idade);
	}
}
