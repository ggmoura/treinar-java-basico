package br.com.treinar.estudo.collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.treinar.estudo.collection.criterioordenacao.CriterioOrdenacaoPessoaNome;
import br.com.treinar.estudo.object.Pessoa;
import br.com.treinar.estudo.object.tipodado.Sexo;

public class OrdenacaoMeuObjeto {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
	pessoas.add(new Pessoa("Gleidson", 6, Sexo.M));
		pessoas.add(new Pessoa("Jorge", 39, Sexo.M));
		pessoas.add(new Pessoa("Henrique", 12, Sexo.M));
		pessoas.add(new Pessoa("Karina", 15, Sexo.F));
		pessoas.add(new Pessoa("Jadine", 15, Sexo.F));
		pessoas.add(new Pessoa("Hugo", 52, Sexo.M));
		pessoas.add(new Pessoa("Cristiano", 5, Sexo.M));
		pessoas.add(new Pessoa("Arturo", 75, Sexo.M));
		pessoas.add(new Pessoa("Artur", 23, Sexo.M));
		pessoas.add(new Pessoa("Cristiano", 28, Sexo.M));
		pessoas.add(new Pessoa("Bruno", 35, Sexo.M));
		pessoas.add(new Pessoa("Gabriel", 8, Sexo.M));
		
		Collections.sort(pessoas);
		System.out.println("Ordenado pela idade");
		imprimir(pessoas);		
		CriterioOrdenacaoPessoaNome comparador = new CriterioOrdenacaoPessoaNome();
		Collections.sort(pessoas, comparador);
		System.out.println("Ordenado pelo nome");
		imprimir(pessoas);
		
		//implementacao da versao java 7
		Collections.sort(pessoas, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				//Integer.valueOf converte um numero int em um Integer.
				Integer indiceO1 = Integer.valueOf(o1.getSexo().ordinal());
				Integer indiceO2 = Integer.valueOf(o2.getSexo().ordinal());
				return indiceO1.compareTo(indiceO2);
			}
			
		});
		//a partir da versao java 8 eh possivel utilizar lambda tem o mesmo efeito das linhas 41 ate 51
		pessoas.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		
		Stream<Pessoa> listPessoa = pessoas.stream().filter((a) -> a.getSexo().equals(Sexo.F));
		
		//foreach a partir do java 8 posso passar como parametro 
		//uma funcao que serah executada durante a iteracao
		listPessoa.forEach(a -> imprimir(a));
		
		System.out.println("Ordenado pelo sexo");
		imprimir(pessoas);
		
	}


	private static void imprimir(Pessoa a) {
		System.out.println(a);
	}
	

	private static void imprimir(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			imprimir(pessoa);
		}
	}
	
}
