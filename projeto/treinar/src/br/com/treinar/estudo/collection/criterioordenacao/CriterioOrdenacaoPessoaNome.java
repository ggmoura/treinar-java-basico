package br.com.treinar.estudo.collection.criterioordenacao;

import java.util.Comparator;

import br.com.treinar.estudo.object.Pessoa;

public class CriterioOrdenacaoPessoaNome implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
