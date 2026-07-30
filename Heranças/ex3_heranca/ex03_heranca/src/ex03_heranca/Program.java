package ex03_heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> contribuintes = new ArrayList<>();
		System.out.println("Entre n° Contribuintes: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {

			System.out.println("Pessoa fisica ou juridica? (f/j)");
			char pessoa = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("\nNome: ");
			String nome = sc.nextLine();
			System.out.println("\nRenda Anual: ");
			Double rendaAnual = Double.parseDouble(sc.nextLine());
			if (pessoa == 'j') {
				System.out.println("\nNumero de funcionarios: ");
				Integer funcionarios = Integer.parseInt(sc.nextLine());
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			} else {
				System.out.println("\nGastos com Saúde: ");
				Double gastoSaude = Double.parseDouble(sc.nextLine());
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
		}
		System.out.println("\nIMPOSTOS A SEREM PAGOS:");
		for (int i = 0; i < n; i++) {
			System.out.println("\n" + contribuintes.get(i).getNome() + ": $ " + contribuintes.get(i).imposto());
		}
	}
}
