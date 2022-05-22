package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountApp {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		Account account;		
		System.out.println("Enter account number: ");
		int number = leia.nextInt();
		System.out.println("Enter account holder: ");
		leia.nextLine();
		String holder = leia.nextLine();
		char op;
		System.out.println("Is there an initial deposit(Y/N) ?");
		op = leia.next().toUpperCase().charAt(0);
		if(op=='Y') {
			System.out.println("Enter initil deposit value: ");
			double amount = leia.nextDouble();			
			account = new Account(number,holder, amount);	
		} else {
			 account = new Account(number,holder);			
		}
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.println("Enter a deposit value: ");
		double value1 = leia.nextDouble();
		account.deposit(value1);
		System.out.println(account.toString());
		
		System.out.println("Enter a withdraw value: ");
		double value2 = leia.nextDouble();
		account.withdraw(value2);
		System.out.println(account.toString());
		}
	}


