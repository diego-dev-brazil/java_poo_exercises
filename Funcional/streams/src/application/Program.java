package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		String strPath = "/home/diegodevkoga/Documents/temp/csvbom.csv";
		File path  = new File(strPath);
		List<Product> list = new ArrayList<>();
		try ( BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line!=null) {
				String[]fields = line.split(",");
				Product pr = new Product(fields[0],Double.parseDouble(fields[1]));
				list.add(pr);
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			double avg = list.stream().mapToDouble(p->  p.getPrice()).average().orElse(0.0);
			System.out.println("Average price: " + String.format("%.2f", avg));
			System.out.println( list.stream()
									.filter(p-> p.getPrice() < avg)
									.map(p -> p.getName())
									.sorted(comp.reversed())
									.toList());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
