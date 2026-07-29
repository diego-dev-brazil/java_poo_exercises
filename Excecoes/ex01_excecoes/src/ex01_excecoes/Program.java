package ex01_excecoes;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data:\nNumber: ");
		Integer number = Integer.parseInt(sc.nextLine());
		System.out.println("\nHolder: ");
		String holder = sc.nextLine();
		System.out.println("\nInitial Balance: ");
		Double initialBalance = Double.parseDouble(sc.nextLine());
		System.out.println("\nWithdraw Limit: ");
		Double withdrawLimit = Double.parseDouble(sc.nextLine());
		Account account = new Account (number,holder,initialBalance,withdrawLimit);
		System.out.println("\nEnter amount for withdraw: ");
		Double amount = Double.parseDouble(sc.nextLine());
		account.withdraw(amount);
		}
		catch(DomainException e){
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Error: Needs to be a number " + e.getLocalizedMessage());
		}
	}

}
