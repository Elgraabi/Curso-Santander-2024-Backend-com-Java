package padroes_De_Projeto.strategy;

public class Robo {
	private Comportamento comportamento;

	public void setStrategy(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
