package one.dio.gof.singleton;

/**
 * Singleton "preguiçoso armazenado"
 * 
 * @author diego-dev-brazil
 */
public class SingletonLazyHolder {
	private static class Holder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return Holder.instancia;
	}
}
