package one.dio.gof;

/**
 * Singleton "apressado"
 * 
 * @author diego-dev-brazil
 */
public class SingletonEager {

		private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
