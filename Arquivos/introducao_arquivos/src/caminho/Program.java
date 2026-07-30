package caminho;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a file path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		System.out.println(path.getName());
		System.out.println(path.getParent());
		System.out.println(path.getPath());
		sc.close();
	}

}
