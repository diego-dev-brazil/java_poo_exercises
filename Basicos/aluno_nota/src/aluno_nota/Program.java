package aluno_nota;

import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student juca = new Student();
		IO.print("Insira Nome: \n");
		juca.name = sc.nextLine();
		IO.print("Insira nota 1° trimestre: \n");
		double grade = sc.nextDouble();
		juca.setGrade1(grade);
		IO.print("Insira nota 2° trimestre: \n");
		grade = sc.nextDouble();
		juca.setGrade2(grade);
		IO.print("Insira nota 3° trimestre: \n");
		grade = sc.nextDouble();
		juca.setGrade3(grade);
		IO.print("Nota final: " + juca.notaFinal());
		if (juca.notaFinal() < 60) {
			IO.print("\nFAILED");
		} else {
			IO.print("\nCONGRATULATIONS");
		}
		sc.close();
	}
}
