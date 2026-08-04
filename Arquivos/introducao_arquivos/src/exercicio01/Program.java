package exercicio01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strPath = sc.nextLine();
		File path = new File(strPath);
		List<String> writeLines = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);
				String newLine = (name + ", " + (price * quantity));
				writeLines.add(newLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String strwPath = path.getParentFile() + "/out";
		File wpath = new File(strwPath);
		wpath.mkdir();
		strwPath += "/summary.csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strwPath))){
			for (String line : writeLines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}