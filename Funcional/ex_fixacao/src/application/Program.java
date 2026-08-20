package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
public class Program {
		public static void main(String[] args) {
			String strPath = "/home/diegodevkoga/Documents/temp/csvbom.csv";
			File path  = new File(strPath);
			List<Employee> list = new ArrayList<>();
			try ( BufferedReader br = new BufferedReader(new FileReader(path))){
				String line = br.readLine();
				while(line!=null) {
					String[]fields = line.split(",");
					Employee pr = new Employee(fields[0],fields[1],Double.parseDouble(fields[2]));
					list.add(pr);
					line = br.readLine();
				}
				Scanner sc = new Scanner (System.in);
				Double value = sc.nextDouble();
				sc.close();
				List<String> funcionarios = list.stream().filter(e-> e.getPrice() > value).map(x-> x.getEmail()).sorted().collect(Collectors.toList());
				System.out.println("Email de funcionarios que ganham menos que " + String.format("%.2f",value));
				funcionarios.forEach(System.out::println);
				double sum = list.stream()
							.filter(p-> p.getName().trim().startsWith("M")).map(p-> p.getPrice()).reduce(0.0, (x,y) -> x+y);
				System.out.println("Soma: " + sum);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
