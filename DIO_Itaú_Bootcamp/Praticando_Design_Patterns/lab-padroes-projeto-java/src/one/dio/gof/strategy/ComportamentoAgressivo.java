package one.dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("MOVENDO DEFENSIVAMENTE...");
	}

}
