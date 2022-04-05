package exercicio_do_while;

import java.util.Scanner;

public class TriangulosEx {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double x =0 ,y=0 ,z = 0;
		double a = 0,b=0,c=0;
		double p=0 ,p1=0;
		double area1=0 ,area2=0;
		System.out.println("Triangle x");
		double areat1 = area(p,area1,x,y,z);
		System.out.println("Triangle y");
		double areat2 =area(p1,area2,a,b,c);
		System.out.println("Triangle x: "+areat1);
		System.out.println("Triangle y: "+areat2);
		
		if (areat1 < areat2) {
			System.out.println("Larger triangle:  y");
		} else {
			System.out.println("Larger triangle:  x");
		}
		leia.close();
	}	
	public static double area (double p, double area ,double x , double y, double z) {
		Scanner leia = new Scanner (System.in);
		do {
			System.out.println("Digite o valor de do lado 1 ");
			x = leia.nextDouble();
		} while (x<=0);
				
		do {
			System.out.println("Digite o valor do lado 2 ");
			y = leia.nextDouble();
		} while (y<=0);		
		do {
			System.out.println("Digite o valor do lado 3");
			z = leia.nextDouble();
		} while (z<=0);		
		double p1 = (x+y+z)/2;
		return  area = Math.sqrt(p1*(p1-x)*(p1-y)*(p1-z));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
