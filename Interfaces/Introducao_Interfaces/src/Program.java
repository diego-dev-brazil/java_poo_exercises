import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com dados do alguuel\n");
		System.out.println("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.println("Retirada: (dd/MM/yyyy hh:mm)");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno: (dd/MM/yyyy hh:mm)");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental (start, finish, new Vehicle(carModel));
		
		System.out.println("entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		RentalService rs = new RentalService (pricePerDay, pricePerHour, new BrazilTaxService());
		rs.processInvoice(cr);
		System.out.println("FAtura:\nPagamento Basico: " + cr.getInvoice().getBasicPayment());
		System.out.println("\nImposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento Total: " + cr.getInvoice().getTotalPayment());
		sc.close();
	}

}
