package br.com.padtec.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return this.livro; 
	}

	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());
	}

}
