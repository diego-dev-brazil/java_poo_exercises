package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Contract {
	private int number;
	private LocalDate data;
	private Double valor;
	private List <Installment> installments = new ArrayList<>();
	public Contract(int number, LocalDate data, Double valor) {
		this.number = number;
		this.data = data;
		this.valor = valor;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public void addInstallment(Installment installment) {
	    installments.add(installment);
	}

	public void removeInstallment(Installment installment) {
	    installments.remove(installment);
	}
	public List<Installment> getInstallments() {
		return installments;
	}
}
