package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre os dados do contrato:\nNumero: ");
		Integer number = Integer.parseInt(sc.nextLine());
		System.out.println("\nData (dd/MM/yyy): ");
		LocalDate date = LocalDate.parse( sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("\nValor do contrato: ");
		Double amount= Double.parseDouble(sc.nextLine());
		Contract contract = new Contract(number,date,amount);
		System.out.println("\nEntre o número de parcelas: ");
		Integer installment_qt = Integer.parseInt(sc.nextLine());
		OnlinePaymentService paypal = new PaypalService();
		ContractService contract_service = new ContractService(paypal);
		contract_service.processContract(contract, installment_qt);
		System.out.println("\nPARCELAS:\n");
		for (Installment c : contract.getInstallments()) {
			System.out.println(c.getDueDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + c.getAmount());
		}
		sc.close();
	}
}
