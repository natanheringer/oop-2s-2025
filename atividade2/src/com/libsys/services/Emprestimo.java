package com.libsys.services;

import com.libsys.entities.Pessoa;

public class Emprestimo {
	public Pessoa pessoa; 
	public Material material; 
	public String dataEmprestimo; 
	public String dataDevolucao;

	
	
	public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao) {
		super();
		this.pessoa = pessoa;
		this.material = material;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}



	public Pessoa getPessoa() {
		return pessoa;
	}



	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}



	public Material getMaterial() {
		return material;
	}



	public void setMaterial(Material material) {
		this.material = material;
	}



	public String getDataEmprestimo() {
		return dataEmprestimo;
	}



	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}



	public String getDataDevolucao() {
		return dataDevolucao;
	}



	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}



	public void exibirDetalhes() {
		System.out.println("Data do emprestimo: " + this.dataEmprestimo);
		System.out.println("Data de devolucao: " + this.dataDevolucao);
		System.out.println("Pessoa vinculada: ");
		this.pessoa.exibirInfo();
		System.out.println("Material vinculado");
		this.material.descricao();
		
	}

}



