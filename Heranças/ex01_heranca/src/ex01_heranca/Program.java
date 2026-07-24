package ex01_heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.print("Enter number of employees: ");int n = sc.nextInt();sc.nextLine();
		for(int i = 0; i < n; i++) {
			Employee employee;
			System.out.println("\nEmployee #" + (i+1) + " data:\n");
			System.out.println("Outsourced? (y/n)\n"); 
			if (sc.nextLine().equals("y")){
				employee = new OutsourcedEmployee();
			}
			else employee = new Employee();
			System.out.println("\nName: ");
			employee.setName(sc.nextLine());
			System.out.println("\nHours: ");
			employee.setHours(sc.nextInt())	;		
			System.out.println("\nValue Per Hour: ");
			employee.setValuePerHour(sc.nextDouble()); sc.nextLine();
			if(employee instanceof OutsourcedEmployee) {
				System.out.println("\nAdditional Charge: ");
				((OutsourcedEmployee) employee).setAdittionalCharge(sc.nextDouble()); sc.nextLine();
			}
			employees.add(employee);
		}
		System.out.println("PAYMENTS:\n");
		for(int i = 0; i < n; i++) {
			System.out.println(employees.get(i).getName() + " - $" + employees.get(i).payment());
		}
		sc.close();
	}
}
