package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product ();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name=sc.nextLine();
		System.out.print("Price: ");
		product.price=sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity=sc.nextInt();
		
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
