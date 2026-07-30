package entities;

import java.util.ArrayList;
import java.util.List;

import entities_enum.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Departments department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker () {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departments department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getDepartment() {
		return department.getName();
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}	
	public void addContract (HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract (HourContract contract) {
		contracts.remove(contract);
	}
	public double income(int year, int month) {
		double sum = baseSalary;
		
		for (HourContract x : contracts) {
			
			int x_year = x.getDate().getYear();
			int x_month = x.getDate().getMonthValue();
			
			if(year == x_year && month == x_month) {
				sum += x.totalValue();
			}
		}
		return sum;
	}
}
