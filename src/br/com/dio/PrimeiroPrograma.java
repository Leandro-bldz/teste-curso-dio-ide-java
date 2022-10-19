package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		class Livro {
			private String nome;
			private String npag;
		}

		Gato gato = new Gato(null, null, null);
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
	}


}
