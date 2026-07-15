package leitura_funcionario;

import java.util.Scanner;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Funcionario chung;
		chung = new Funcionario();
		Scanner sc = new Scanner(System.in);
		chung.name = sc.nextLine();
		chung.GrossSalary = sc.nextDouble();
		chung.tax = sc.nextDouble();
		String text = chung.toString();
		IO.print(text);
		double porc = sc.nextDouble();
		chung.IncreaseSalary(porc);
		text = chung.toString2();
		IO.print(text);
		sc.close();
	}
}
