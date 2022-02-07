package app;

import java.util.Scanner;

public class Atividade_3_exercicio_5 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int a,b=0;
		
		
		
		do {
			System.out.println("Digite um número: ");
			a=leia.nextInt();
			b=b+a;
			
		}while(a!=0);
		System.out.println("Soma: "+b);

	}

}
