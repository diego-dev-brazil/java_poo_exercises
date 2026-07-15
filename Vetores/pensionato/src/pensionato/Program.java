package pensionato;

import java.util.Scanner;

import entitites.Rent;

public class Program {
	public static void main(String[] args) {
		Rent[] quartos = new Rent[10];
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			IO.print("Quantos quartos vao ser alugados: "); 
			n = sc.nextInt();
			IO.print(n);
			sc.nextLine();
		} while (n < 0 || n > 11);
		for (int y = 0; y < n; y++) {
			
			IO.print("\nHóspede #" + (y+1) + ":\n Nome: ");
			String nome = sc.nextLine();
			IO.print("\nEmail: ");
			String email = sc.nextLine();
			IO.print("\nQuarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			while ( quarto <= 0 || quarto > 10 || quartos[quarto-1] != null){
				IO.print("Quarto cheio, escolha outro: ");
				quarto = sc.nextInt();
				sc.nextLine();
			}
			quartos[quarto-1] =  new Rent (nome, email, quarto-1);
		}
		// MOSTRAR
		for (int y = 0; y < 10; y++) {
			if (quartos[y] != null) {
				IO.print("\nHóspede #" + (y+1) + ":\n Nome: " +
				quartos[y].getName());
				IO.print("\nEmail: " +
				quartos[y].getEmail());
				IO.print("\nQuarto: " + 
				(quartos[y].getRoom() + 1));
			}
		}
	}
}
