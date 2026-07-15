package entities;

import java.util.Scanner;

public class Student {
	public String name;
	private double grade1, grade2, grade3;
	Scanner sc = new Scanner(System.in);

	public void setGrade1(double grade) {
		while (grade > 30 || grade < 0) {
			IO.print("\nTente de novo: ");
			grade = sc.nextDouble();
		}
		grade1 = grade;
	}

	public void setGrade2(double grade) {
		while (grade > 35 || grade < 0) {
			IO.print("\nTente de novo: ");
			grade = sc.nextDouble();
		}
		grade2 = grade;
	}

	public void setGrade3(double grade) {
		while (grade > 35 || grade < 0) {
			IO.print("\nTente de novo: ");
			grade = sc.nextDouble();
		}
		grade3 = grade;
	}
	public double notaFinal() {
		double final_grade = grade1 + grade2 + grade3;
		return final_grade;
	}

}
