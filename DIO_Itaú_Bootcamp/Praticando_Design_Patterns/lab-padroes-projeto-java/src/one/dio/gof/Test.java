package one.dio.gof;

import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.Comportamento;
import one.dio.gof.strategy.ComportamentoAgressivo;
import one.dio.gof.strategy.ComportamentoDefensivo;
import one.dio.gof.strategy.ComportamentoNormal;
import one.dio.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//testes de singleton
		System.out.println("\n========SINGLETON TESTS========\n");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		SingletonLazy lazy2 = SingletonLazy.getInstancia();
		SingletonEager eager = SingletonEager.getInstancia();
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazy);
		System.out.println(lazy2);
		System.out.println(eager);
		System.out.println(lazyholder);
		
		//testes de strategy
		System.out.println("\n========STRATEGY TESTS========\n");
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
	}
}
