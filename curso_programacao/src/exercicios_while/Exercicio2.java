package exercicios_while;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor de X:");
		int x = leia.nextInt();
		System.out.println("Digite o valor de Y:");
		int y = leia.nextInt();
		
		while((x!=0)&&(y!=0)) {
			
			
			if ((x>0)&&(y>0)) {
				System.out.println("Primeiro");
			}
			else if ((x<0)&&(y>0)) {
				System.out.println("Segundo");
			}
			else if ((x<0)&&(y<0)) {
				System.out.println("Terceiro");
			}
			else if((x>0)&&(y<0)) {
				System.out.println("Quarto");
			}
			
			System.out.println("Digite o valor de X:");
			 x = leia.nextInt();
			System.out.println("Digite o valor de Y:");
			 y = leia.nextInt();
		}
		
		leia.close();
	}

}
