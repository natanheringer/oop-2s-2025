package com.libsys.services;

public class Revista extends Material {
	
	private Integer edicao;

	public Revista(String titulo, Integer anoPublicacao, Integer edicao) {
		super(titulo, anoPublicacao);
		this.edicao = edicao;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

	@Override
	public void descricao() {
		// TODO Auto-generated method stub
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Ano de publicacao: " + this.getAnoPublicacao());
		System.out.println("Edicao: " + this.getEdicao());
	} 
	
	
		
	
}
