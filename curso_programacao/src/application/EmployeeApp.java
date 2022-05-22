package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		Employee funcionario = new Employee();
		
		System.out.print("Enter name: ");
		funcionario.name = leia.nextLine();
		System.out.print("Enter gross salary: ");
		funcionario.grossSalary = leia.nextDouble();
		System.out.print("Enter tax: ");
		funcionario.tax = leia.nextDouble();
		
		System.out.println(funcionario.toString());
		
		System.out.println("Which percentage to increse salary? ");
		funcionario.increse= leia.nextDouble();
		
		funcionario.increseSalary(funcionario.increse);
		
		System.out.println(funcionario.toString());
		leia.close();
	}

}
