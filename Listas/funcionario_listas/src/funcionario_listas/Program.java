package funcionario_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {
	public static void main(String[] args) {
		List<Funcionarios> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira quantos funcionários adicionar: ");
		int n = sc.nextInt();
		sc.nextLine();
		String nome;
		String id;
		Double salario;
		for (int x = 0; x < n; x++) {
			System.out.println("\nInsira nome: ");
			nome = sc.nextLine();
			boolean existe = false;
			do {
				existe = false;
				System.out.println("\nInsira id: ");
				id = sc.nextLine();
				for (Funcionarios idx : lista) {
					if (id.equals(idx.getId())) {
						System.out.println("\nJá existe, insira novamente\n");
						existe = true;
						break;
					}
				}
			} while (existe == true);
			System.out.println("Insira salário: ");
			salario = sc.nextDouble();
			sc.nextLine();
			lista.add(new Funcionarios(id, nome, salario));
		}
		System.out.println("Insira id do funcionario que ganha aumento: ");
		id = sc.nextLine();
		System.out.println("Insira porcentagem a ser aumentada: ");
		salario = sc.nextDouble();
		for (Funcionarios idx : lista) {
			if(idx.getId().equals(id)) {
				idx.AumentarSalario(salario);
				break;
			}
		}
		for (Funcionarios idx : lista) {
			System.out.println(idx.toString());
		}
		sc.close();
	}
}
