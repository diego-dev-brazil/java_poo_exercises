package entities;

public class Funcionario {
	public String name;
	public double GrossSalary;
	public double tax;
	double porcentagem;

	public double NetSalary() {
		return GrossSalary - tax;
	}

	public double IncreaseSalary(double porcentagem) {
		this.porcentagem = porcentagem;
		porcentagem /= 100;
		GrossSalary += GrossSalary * porcentagem;
		return GrossSalary;
	}
	
	public String toString() {
		return "Name: " + name + 
				"\nGross Salary: " + GrossSalary +
				"\ntax: " + tax +
				"\n\nEmployee: " + name + ", " + NetSalary();
	}
	public String toString2() {
		return "Name: " + name + 
				"\nGross Salary: " + GrossSalary +
				"\ntax: " + tax +
				"\n\nEmployee: " + name + ", " + NetSalary() + 
				"\nAumento de: " + porcentagem + "%";
	}
}
