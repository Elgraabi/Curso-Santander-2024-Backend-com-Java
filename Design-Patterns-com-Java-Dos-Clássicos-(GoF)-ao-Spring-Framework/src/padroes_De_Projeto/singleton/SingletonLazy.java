package padroes_De_Projeto.singleton;

/**
 * Singleton "Preguiçoso"
 * 
 * @author techi
 * 
 */
public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}

	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
