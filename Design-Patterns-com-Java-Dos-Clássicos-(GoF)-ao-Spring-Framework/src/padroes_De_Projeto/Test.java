package padroes_De_Projeto;

import padroes_De_Projeto.facade.Facade;
import padroes_De_Projeto.singleton.SingletonEager;
import padroes_De_Projeto.singleton.SingletonLazy;
import padroes_De_Projeto.singleton.SingletonLazyHolder;
import padroes_De_Projeto.strategy.Comportamento;
import padroes_De_Projeto.strategy.ComportamentoAgressivo;
import padroes_De_Projeto.strategy.ComportamentoDefensivo;
import padroes_De_Projeto.strategy.ComportamentoNormal;
import padroes_De_Projeto.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		// Singleton:
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Strategy:
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();

		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		// Facade:
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "1480787878");
	}

}
