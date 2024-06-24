package padroes_De_Projeto.strategy;

public class ComportamentoNormal implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo-se Normalmente...");
	}

}
