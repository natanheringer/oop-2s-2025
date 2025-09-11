package com.os.entities;

public class Programa {

	
	private Integer memoriaRAMAlocada;
	private Integer SSDOcupado; 
	private Integer nucleos; 
	private Integer quantidadeOperacoes;
	
	
	
	
	/* Constructor using fields */
	public Programa(Integer memoriaRAMAlocada, Integer sSDOcupado, Integer nucleos, Integer quantidadeOperacoes) {
		super();
		this.memoriaRAMAlocada = memoriaRAMAlocada;
		SSDOcupado = sSDOcupado;
		this.nucleos = nucleos;
		this.quantidadeOperacoes = quantidadeOperacoes;
	}
	
	/*Getters and Setters*/
	public Integer getMemoriaRAMAlocada() {
		return memoriaRAMAlocada;
	}
	public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {
		this.memoriaRAMAlocada = memoriaRAMAlocada;
	}
	public Integer getSSDOcupado() {
		return SSDOcupado;
	}
	public void setSSDOcupado(Integer sSDOcupado) {
		SSDOcupado = sSDOcupado;
	}
	public Integer getNucleos() {
		return nucleos;
	}
	public void setNucleos(Integer nucleos) {
		this.nucleos = nucleos;
	}
	public Integer getQuantidadeOperacoes() {
		return quantidadeOperacoes;
	}
	public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
		this.quantidadeOperacoes = quantidadeOperacoes;
	}
	
	
	
	
}
