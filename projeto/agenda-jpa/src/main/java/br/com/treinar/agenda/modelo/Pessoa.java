package br.com.treinar.agenda.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@NotNull // campo nao pode ser nulo
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;

	@Transient // indica que este atributo nao sera um camo no banco de dados
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
