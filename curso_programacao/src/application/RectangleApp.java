package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Height");
		rectangle.height =sc.nextDouble();
		
		rectangle.area();
		rectangle.diagonal();
		rectangle.perimeter();
		
		System.out.println(rectangle.toString());
		
		
		
		sc.close();
	}

}
