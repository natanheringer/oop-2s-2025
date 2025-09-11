package com.os.entities;

import com.os.services.SimulationService;

public class SistemaOperacional {
	
	

	private Computador computador;
	
	private SimulationService simulationService;

	public SistemaOperacional(Computador computador) {
		this.computador = computador;
		this.simulationService = new SimulationService();
	}

	public Computador getComputador() {
		return computador;
	}

	public void setComputador(Computador computador) {
		this.computador = computador;
	}
	
	public void executarPrograma(Programa p) {
		simulationService.executarSimulacao(p, this.computador);
	}
}
