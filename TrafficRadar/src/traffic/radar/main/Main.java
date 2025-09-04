package traffic.radar.main;

import traffic.radar.entities.Carro;
import traffic.radar.entities.Radar;

public class Main {

	public static void main(String[] args) {
		
		Carro opala = new Carro("ACLR300","Comodoro", 76,0);
		
		Radar radar = new Radar("Pistao Sul", 60);
		
		radar.avaliarVelocidade(opala);
		
		opala.acelerar();
		opala.acelerar();
		opala.acelerar();
		
		opala.setVelocidade(60);
		radar.avaliarVelocidade(opala);
		opala.frear();
		
		
	}
	
	
}
