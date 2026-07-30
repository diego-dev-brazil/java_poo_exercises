package cotacao_dolar;
import java.util.Scanner;

import entities.CurrencyConverter;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		IO.print("Entre cotação do dólar: ");
		double cotacao = sc.nextDouble();
		IO.print("Entre valor em dólar a ser convertido: ");
		double valor = sc.nextDouble();
		System.out.printf("""
		What is the dollar price: %.2f
		How many dollars will be bought: %.2f
		Amount to be paid in reais: %.2f
				""", cotacao, valor, CurrencyConverter.converterReais(cotacao, valor));
	}
}
