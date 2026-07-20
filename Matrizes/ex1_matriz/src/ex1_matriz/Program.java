package ex1_matriz;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Insira tamanho da matriz: ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Integer[][] matriz = new Integer[n][n];
		int negativos = 0;
		
		for(int lin = 0; lin < n; lin++) {
			for (int col = 0; col < n; col++){
				matriz[lin][col] = sc.nextInt();
				if(matriz[lin][col] < 0) {
					negativos++;
				}
			}
		}
		System.out.println("\nDiagonal Principal: ");
		for (int lin = 0; lin < n; lin++) {
			for (int col = 0 + lin; col < n;) {
				System.out.println(matriz[lin][col]);
				break;
			}
		}
		System.out.println("\nTotal de negativos: " + negativos);
		sc.close();
	}
}
