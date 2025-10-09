package com.libsys.services;

public class Livro extends Material {
	private String autor;
	
	public Livro (String titulo, Integer anoPublicacao, String autor) {
		super(titulo, anoPublicacao);
		this.autor = autor; 
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public void descricao() {
		// TODO Auto-generated method stub
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Ano de publicacao: " + this.getAnoPublicacao());

	}
	
	
	
}
