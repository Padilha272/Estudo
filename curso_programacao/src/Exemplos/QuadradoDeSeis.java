package Exemplos;

import java.util.Scanner;

public class QuadradoDeSeis {

	public static void main(String[] args) {
		

		
		
		Scanner leia = new Scanner (System.in);
		int x =0;
		int y =0;
		
		do {
			System.out.println("Digite um número");
			x = leia.nextInt();
			y =x*x;
			System.out.println(y);
			
		} while ((x%6)!=0);
		
		leia.close();
	}

	
	
	
	
}
