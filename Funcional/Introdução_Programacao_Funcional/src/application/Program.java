package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Predicate<Product> pred = y-> y.getPrice() >= 100;
		Consumer<Product> cons = x-> x.setPrice(x.getPrice() *  1.1);
		Function<Product,String> func = p-> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		List<Product> listou = new ArrayList<>(list); 
		listou.removeIf(pred);
		list.forEach(cons);
		
		listou.forEach(System.out::println);
		System.out.println("\n");
		list.forEach(System.out::println);
		System.out.println("\n");
		names.forEach(System.out::println);
		
	}

}
