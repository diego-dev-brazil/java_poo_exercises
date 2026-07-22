package exer03_enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter client data: \n" + "Name: ");
		String cl_name = sc.nextLine();
		System.out.println("\nEmail: ");
		String cl_email = sc.nextLine();
		System.out.println("\nBirth Date (dd/MM/YYYY): ");
		String cl_date = sc.nextLine();
		LocalDate cl_date_ld = LocalDate.parse(cl_date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Client client = new Client(cl_name,cl_email,cl_date_ld);
		System.out.println("Enter order data: \n" + "Status: ");
		String entrada = sc.nextLine().toUpperCase();
		OrderStatus status = OrderStatus.valueOf(entrada);
		Order order = new Order(LocalDateTime.now(),status , client);
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i< n; i++) {
			System.out.println("Enter item #" + (i+1) + " data:\nProduct name: " );
			String pr_name = sc.nextLine();
			System.out.println("\nProduct price: ");
			Double pr_price = sc.nextDouble();
			sc.nextLine();
			System.out.println("\nQuantity: ");
			Product product = new Product (pr_name, pr_price);
			Integer ordItem_quantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(ordItem_quantity,product);
			order.addItem(orderItem);
		}
		System.out.println("\n" + order.toString());
		sc.close();
	}
}
