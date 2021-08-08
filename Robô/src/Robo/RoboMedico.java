package Robo;

public class RoboMedico  implements Robo {
	
	private float diametro;
	private float profundidade;
	
	public RoboMedico() {
		diametro=0.0F;
		profundidade=0.0f;
	}
	
	@Override
	public String ativar() {
		return String.format("\nConfigurando o bisturi do rob� m�dico!") ;
	}
	
	@Override
	public String recarregar() {
		return String.format("\nRecarregando o rob� m�dico na tomada!");
	}
	
	
	public String cortar(float diametro, float profundidade) {		
		return String.format("\nO Rob� M�dico vai cortar at� o di�metro  %.1f (cm) e profundidade %.1f (cm) ", diametro , profundidade);
	}

}
