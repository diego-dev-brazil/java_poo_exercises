package entities;

public class CurrencyConverter {
	public static double converterReais(double cotacao, double valor) {
		return (valor + (valor * 0.06)) * cotacao ;
	}
}
