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

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}
	
	
}
