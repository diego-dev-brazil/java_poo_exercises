package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		File path = new File ("/home/temp/arquivo.csv");
		try (BufferedReader br = new BufferedReader (new FileReader (path))){
			String line = br.readLine();
			String[] fields = line.split(",");
			Product product = new Product();
			product.name = fields[0];
			product.price = Double.parseDouble(fields[1]);
			list.add(product);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CalculationService.max(list);
	}

}
