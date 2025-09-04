package traffic.radar.entities;

public class Radar {
	
	private String localizacao;
	private Integer limiteVelocidade;

	public Radar(String localizacao, Integer limiteVelocidade) {
		this.limiteVelocidade = limiteVelocidade;
		this.localizacao = localizacao;
	}
	
	public Radar(Integer limiteVelocidade) {
		this.limiteVelocidade = limiteVelocidade;
	}
	
	public void emitirNotificacao(String placa, Integer velocidadeObservada, Integer ano, String modelo) {
		System.out.println("Placa" + placa);
		System.out.println("Velocidade observada" + velocidadeObservada);
		System.out.println("Local da infracao: " + this.localizacao);
		System.out.println("Velocidade na via: " + this.limiteVelocidade);
		System.out.println("Detalhes do infrator\n" + ano + "\n Modelo:" + modelo);
	}
	
	public void avaliarVelocidade(Carro carro) {
		if(carro.getVelocidade() > this.limiteVelocidade) {
			emitirNotificacao(carro.getPlaca(), carro.getVelocidade(),
					carro.getAno(), carro.getModelo());
		}
	}
}

