package one.dio.gof;

public class Test {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		SingletonLazy lazy2 = SingletonLazy.getInstancia();
		SingletonEager eager = SingletonEager.getInstancia();
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazy);
		System.out.println(lazy2);
		System.out.println(eager);
		System.out.println(lazyholder);

	}

}
