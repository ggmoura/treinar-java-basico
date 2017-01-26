package br.com.treinar.agenda.modelo;

/**
 * Tipo de dado de dominio discreto
 * 
 * Determina todos os valores possiveis para operadoras.
 * 
 * Os tipos sao separados por virgula
 * 
 * @author ADM
 *
 */
public enum Operadora {

	OI(31, "Oi") {
		@Override
		public Double calcularTarifa(Integer tempo) {//exigencia do metodo abstrato
			return tempo * 0.95;
		}
	},
	CLARO(21, "Claro") {
		@Override
		public Double calcularTarifa(Integer tempo) {//exigencia do metodo abstrato
			// TODO Auto-generated method stub
			return tempo * 0.85;
		}
	}, 
	VIVO(15, "Vivo") {
		@Override
		public Double calcularTarifa(Integer tempo) {//exigencia do metodo abstrato
			// TODO Auto-generated method stub
			return tempo * 0.78;
		}
	}, 
	TIM(41, "Tim") {
		@Override
		public Double calcularTarifa(Integer tempo) {//exigencia do metodo abstrato
			// TODO Auto-generated method stub
			return tempo * 0.87;
		}
	};

	private Operadora(Integer codigoOperadora, String descricao) {
		this.codigoOperadora = codigoOperadora;
		this.descricao = descricao;
	}

	private Integer codigoOperadora;
	private String descricao;

	public Integer getCodigoOperadora() {
		return codigoOperadora;
	}

	public String getDescricao() {
		return descricao;
	}

	//todas as instancias deverao implementar este metodo
	public abstract Double calcularTarifa(Integer tempo);
	
}
