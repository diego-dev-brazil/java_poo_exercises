package entities;

public class Conta {
	private final String numero;
	private String titular;
	private double caixa;

	public Conta(String numero, String titular, double deposito) {
		this.numero = numero;
		this.titular = titular;
		this.caixa = deposito;
	}

	public Conta(String numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.caixa = 0.0;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return this.titular;
	}

	public String getNumero() {
		return this.numero;
	}

	public double getCaixa() {
		return this.caixa;
	}

	public void deposito(double deposito) {
		caixa += deposito;
	}

	public void saque(double saque) {
		caixa -= saque + 5;
	}
	
	public void mostrarConta() {
		System.out.println
		("Titular: " + titular +
		 "\nCaixa: " + caixa);
	}
}
