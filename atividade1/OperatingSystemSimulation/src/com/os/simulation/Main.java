package com.os.simulation;

import com.os.entities.Computador;
import com.os.entities.Programa;
import com.os.entities.SistemaOperacional;

public class Main {

	
		public static void main(String[] args) {
			
			
			Computador computador = new Computador(8, 500, 4, 2.5f); 
			
			
			/*Program OK*/
			Programa programaOK = new Programa(4, 100, 2, 1000);
			
			/* Program Error SSD */
			Programa programaSSD = new Programa(4, 600, 2, 1000);
			
			/* Program RAM Error */
			Programa programaRAM = new Programa(10, 100, 2, 1000);
			
			/* OS Instance */
			SistemaOperacional so = new SistemaOperacional(computador);
			so.executarPrograma(programaOK); /* Success */
			so.executarPrograma(programaSSD); /* error SSD*/
			so.executarPrograma(programaRAM); /* RAM error */
			
			
		}
}
