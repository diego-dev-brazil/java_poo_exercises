package exer01_enums;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Departments;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkerLevel;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Departments dep = new Departments ();
		System.out.println("Insira o departamento: ");
		dep.setName(sc.nextLine());
		System.out.println("Insira nome: ");
		String nome = sc.nextLine();
		System.out.println("Insira cargo: ");
		String entrada = sc.nextLine().toUpperCase();
		WorkerLevel cargo = WorkerLevel.valueOf(entrada);
		System.out.println("Insira o Salário Base: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		Worker worker = new Worker (nome, cargo, baseSalary, dep);
		System.out.println("Quantos contratos você vai colocar?: ");
		int n = sc.nextInt();
		sc.nextLine();
		LocalDate date;
		for (int i = 0; i< n; i++) {
			System.out.println("Entre os dados do contrato #" + (i+1) + "\n");
			System.out.println("Data (DD/MM/YYYY): ");
			date = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.println("\nQuanto ele ganha à hora?: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			System.out.println("Quantas horas ele trabalha?: ");
			Integer hour = sc.nextInt();
			sc.nextLine();
			HourContract contract = new HourContract(date, valuePerHour, hour);
			worker.addContract(contract);
		}
		
		System.out.println("Entre mês e ano para calcular income(MM/YYYY): ");
		date = LocalDate.parse("01/" + sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println
			("Name: " + worker.getName() +
					"\nDepartment: " + worker.getDepartment() +
					"\nIncome for " + date + ": " + worker.income(date.getYear(), date.getMonthValue()));
		sc.close();
	}
}
