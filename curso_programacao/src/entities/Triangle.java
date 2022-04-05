package entities;

import java.util.Scanner;

public class Triangle {

	
	public double a;
	public double b;
	public double c;
	
	
	public  double calcularArea () {
		
		double p = (a+ b +c)/ 2;
		 return  Math.sqrt(p*(p-a)*(p-b)*(p-c));
		 
		
	}
	/*public double x ;
	public double y ;
	public double z;
	public double p;
	public double area;
	public Triangle(double x, double y, double z, double p, double area) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.p = p;
		this.area = area;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
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
	
	
}*/
}
