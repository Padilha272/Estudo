package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class CalculatorApp {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner ( System.in);
		
		System.out.print("Enter radius: ");
		double radius = leia.nextDouble();
		
		double c = Calculator.circunference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference %.2f\n",c);
		System.out.printf("Volume: %.2f\n",v);
		System.out.printf("PI value: %.2f",Calculator.PI);
	}
	
	
}
