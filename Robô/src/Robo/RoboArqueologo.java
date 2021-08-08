package Robo;

public class RoboArqueologo implements Robo{
	
	private float profundidade; 
	
	public RoboArqueologo() {
		profundidade=0.0f;
	}

	@Override
	public String ativar() {
		return String.format("\nPreparando a p� do rob� arque�logo!");
	}

	@Override
	public String recarregar() {	
		return String.format("\nTrocando a bateria do rob� arque�logo!");
	}

	public String cavar(float profundidade) {
		return String.format("\no rob� est� cavando at� chegar na profundidade %.0f (cm)", profundidade);
	}	

}
