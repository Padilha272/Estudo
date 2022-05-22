package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Price: ");
		double price=sc.nextDouble();
		/*System.out.println("Quantity: ");
		int quantity=sc.nextInt();*/
		
		Product product = new Product(name, price);
		product.setName("Computer");
		System.out.println("Updated name: "+product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated Price: "+product.getPrice());
		System.out.println("Data: "+product);
		
		
		//System.out.println(product.name+", "+product.price+", "+product.quantity );
		
		System.out.print("Add quantity: ");
		int add = sc.nextInt();
		product.addProducts(add);
		
		System.out.println("Updated data: "+product);
		
		System.out.print("Remove quantity: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		
		System.out.println("Updated data: "+product);
		
		sc.close();
	}

}
