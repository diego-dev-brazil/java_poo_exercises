import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo x = new Retangulo();
		IO.println("Entre base do retângulo: ");
		x.base = sc.nextDouble();
		IO.println("\nEntre altura do retângulo: ");
		x.altura = sc.nextDouble();
		String result = x.toString();
		System.out.println(result);
		sc.close();
	}
}