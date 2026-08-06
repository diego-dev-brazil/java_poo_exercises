package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService service;
	
	public ContractService (OnlinePaymentService service) {
		this.service = service;
	}
	public void processContract(Contract contract, Integer months) {
		Double installmentValue = contract.getValor() / months;
		for (int n = 1;n <= months;n++) {
			LocalDate dueDate = contract.getData().plusMonths(n);
			Double amount = service.interest(service.paymentFee(installmentValue), n);
			Installment installment = new Installment(dueDate,amount);
			contract.addInstallment(installment);
		}
		
	}
	
}
