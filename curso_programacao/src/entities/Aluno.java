package entities;

import java.util.Scanner;

public class Aluno {
	
	public double nota1;
	
	public double nota2;
	
	public double nota3;
	
	public double media(double nota1 , double nota2 , double nota3) {
		Scanner leia = new Scanner (System.in);
		while (nota1<0 || nota1>30) {
			System.out.println("Enter first value: ");
			this.nota1= nota1 = leia.nextDouble();
		}
		
		while (nota2<0 || nota2>35) {
			System.out.println("Enter second value: ");
			this.nota2= nota2 = leia.nextDouble();
		}
		
		while (nota3<0 || nota3>35) {
			System.out.println("Enter third value: ");
			this.nota3= nota3 = leia.nextDouble();
		}
		leia.close();
		
		if((nota1+nota2+nota3)<60) {
			
			System.out.println("FAILED");
			
			System.out.println("Missing "  + (60-(this.nota1+this.nota2+this.nota3))+" points");
		} else {
			System.out.println("Final grade: "+(this.nota1+this.nota2+this.nota3));
			System.out.println("PASS");
		}
		
		return nota1+nota2+nota3;
		
		
	}
	
	
	
	
	
	
	
}
