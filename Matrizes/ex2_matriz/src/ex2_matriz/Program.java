package ex2_matriz;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][]	matriz = new int [m][n]	;
		for (int i = 0; i < m; i++) {
		    for (int j = 0; j < n; j++) {
		        matriz[i][j] = sc.nextInt();
		    }
		}
		int x = sc.nextInt();
		for (int lin = 0; lin < m;lin++) {
			for(int col = 0; col < n; col++) {
				if(matriz[lin][col] == x) {
					System.out.println("Position: " + lin + ", "+ col);
					System.out.println(col > 0 ? "Left: " + matriz[lin][col-1] : "");
					System.out.println(col < matriz[lin].length - 1 ? "Right: " + matriz [lin][col + 1]: "");
					System.out.println(lin < matriz.length - 1 ? "Down: " + matriz[lin+1][col] : "");
					System.out.println(lin > 0 ? "Up: " + matriz [lin-1][col] : "");					
				}
			}
		}
		sc.close();
	}

}
