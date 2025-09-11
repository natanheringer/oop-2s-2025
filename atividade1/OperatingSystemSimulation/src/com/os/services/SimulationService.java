package com.os.services;

import com.os.entities.Computador;
import com.os.entities.Programa;

public class SimulationService {

	public boolean validarInstalacao(Programa programa, Computador computador) {
		return programa.getSSDOcupado() <= computador.getSSD();
	}
	
	public boolean validarExecucao(Programa programa, Computador computador) {
			return programa.getMemoriaRAMAlocada() <= computador.getMemoriaRAM();
	}
	
	public float calcularTempoExecucao(Programa programa, Computador computador) {
			return (float) programa.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleos());
	}
	
	
	public void executarSimulacao(Programa programa, Computador computador) {
		if(!validarInstalacao(programa, computador)) {
			System.out.println("Erro na instalacao: ssd insuficiente");
			return; 
		}
		
		if(!validarExecucao(programa, computador)) {
			System.out.println("erro na execucao: RAM insuficiente ");
			return;
		}
		
	System.out.println("Programa executado com sucesso");
	float tempo = calcularTempoExecucao(programa, computador);
	System.out.println("execution time: " + tempo + "segundos");
	}
	
}
