package com.os.entities;

public class Computador {

	
	private Integer memoriaRAM;
	private Integer SSD;
	private Integer nucleos;
	private Float operacoesPorSegundo;
	
	
	/* Constructor using fields */
	public Computador(Integer memoriaRAM, Integer sSD, Integer nucleos, Float operacoesPorSegundo) {
		super();
		this.memoriaRAM = memoriaRAM;
		SSD = sSD;
		this.nucleos = nucleos;
		this.operacoesPorSegundo = operacoesPorSegundo;
	}
	
	/*Getters and Setters*/
	public Integer getMemoriaRAM() {
		return memoriaRAM;
	}
	public void setMemoriaRAM(Integer memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	public Integer getSSD() {
		return SSD;
	}
	public void setSSD(Integer sSD) {
		SSD = sSD;
	}
	public Integer getNucleos() {
		return nucleos;
	}
	public void setNucleos(Integer nucleos) {
		this.nucleos = nucleos;
	}
	public Float getOperacoesPorSegundo() {
		return operacoesPorSegundo;
	}
	public void setOperacoesPorSegundo(Float operacoesPorSegundo) {
		this.operacoesPorSegundo = operacoesPorSegundo;
	}
	
	
}
