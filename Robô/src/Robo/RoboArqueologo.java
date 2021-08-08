package Robo;

public class RoboArqueologo implements Robo{
	
	private float profundidade; 
	
	public RoboArqueologo() {
		profundidade=0.0f;
	}

	@Override
	public String ativar() {
		return String.format("\nPreparando a pá do robô arqueólogo!");
	}

	@Override
	public String recarregar() {	
		return String.format("\nTrocando a bateria do robô arqueólogo!");
	}

	public String cavar(float profundidade) {
		return String.format("\no robô está cavando até chegar na profundidade %.0f (cm)", profundidade);
	}	

}
