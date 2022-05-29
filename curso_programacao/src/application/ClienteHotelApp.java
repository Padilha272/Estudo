package application;

import java.util.Scanner;

import entities.ClienteHotel;

public class ClienteHotelApp {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ClienteHotel quarto[] = new ClienteHotel[10];
		int x = 0;
		System.out.print("How many rooms will be rented? ");
		int n = leia.nextInt();
		for (int i=0;i<n;i++) {
		leia.nextLine();
		System.out.println("Cliente#"+(i+1));
		System.out.println("Digite o nome do cliente: ");
		String nome = leia.nextLine();
		System.out.println("Digite o email do cliente: ");
		String email = leia.nextLine();
		do {
		System.out.println("Digite o número do quarto: ");
		x = leia.nextInt();
		if(quarto[x]!=null) {
			System.out.println("Quarto já reservado!");
		}
		}while(quarto[x]!=null);
		
		
		quarto[x]= new ClienteHotel(nome,email);	
		}			
		System.out.println("Busy rooms:");
		for (int i=0;i<10;i++) {
			if(quarto[i]!=null) {
				System.out.println(i+": "+quarto[i].getNome()+","+quarto[i].getEmail());
			}
		}
		
		
		
		
		
		
		

	}

}
