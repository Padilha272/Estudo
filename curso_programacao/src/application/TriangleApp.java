package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class TriangleApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter de measures of triangle X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		double areax = x.calcularArea();
		System.out.println("Triangle x area: "+areax);
		
		System.out.println("Enter de measures of triangle Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();		
		double areay = y.calcularArea();
		System.out.println("Triangle y area: "+areay);
		if (areay >areax) {
			System.out.println("Larger Triangle: Y");
		} else {
			System.out.println("Larger Triangle: X");
		}
		
		}
		/*Triangle trianglex = new Triangle(0, 0, 0, 0, 0);
		
		Scanner leia = new Scanner (System.in);
		double p=0,area=0,x=0,y=0,z=0;
		double valor = trianglex.area(p,area,x,y,z);
		System.out.println(valor);
		leia.close();*/
	}


