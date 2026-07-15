package exercicio_banco;

import entities.Conta;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		double valor;
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.println("""
						CONTA BANCARIA\n
						Escreva titular e numero da conta:
				""");
		String titular = sc.nextLine();
		String numero = sc.nextLine();
		System.out.println("""
						Tem valor para depositar?\n
						s/n
				""");
		if (sc.nextLine().equalsIgnoreCase("s")) {
			valor = sc.nextDouble();
			conta = new Conta(numero, titular, valor);
		} else {
			conta = new Conta(numero, titular);
		}
		// DEPOSITO //
		System.out.println("\nInsira numero da conta: ");
		sc.nextLine();
		numero = sc.nextLine();
		if (numero.equals(conta.getNumero())) {
			System.out.println("\nInsira valor do deposito: ");
			valor = sc.nextDouble();
			conta.deposito(valor);
			conta.mostrarConta();
		}
		// SAQUE //
		System.out.println("\nInsira numero da conta: ");
		sc.nextLine();
		numero = sc.nextLine();
		if (numero.equals(conta.getNumero())) {
			System.out.println("\nInsira valor do saque: ");
			valor = sc.nextDouble();
			conta.saque(valor);
			conta.mostrarConta();
		}
		sc.close();
	}
}
