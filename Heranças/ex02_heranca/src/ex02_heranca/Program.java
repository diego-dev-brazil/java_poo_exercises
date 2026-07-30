package ex02_heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		System.out.println("Enter the number of products: ");
		Integer n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:\n");
			System.out.println("Common, used or imported (c/u/i)?");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("\nName: ");
			String name = sc.nextLine();
			System.out.println("\nPrice: ");
			Double price = Double.parseDouble(sc.nextLine());
			if (type == 'u') {
				System.out.println("\nManufactured Date: ");
				LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product product = new UsedProduct(name, price, date);
				products.add(product);
				continue;
			}
			if (type == 'i') {
				System.out.println("\nCustoms Fee: ");
				Double customsFee = Double.parseDouble(sc.nextLine());
				Product product = new ImportedProduct(name, price, customsFee);
				products.add(product);
				continue;
			}
			Product product = new Product(name, price);
			products.add(product);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("PRICE TAGS: \n");
			System.out.println(products.get(i).priceTag() + "\n");
		}
		sc.close();
	}
}
