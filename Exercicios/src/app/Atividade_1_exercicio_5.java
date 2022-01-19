package app;

import java.util.Scanner;

public class Atividade_1_exercicio_5 {

	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		double a,b,c,media;
		System.out.println("Digite a:");
		a=leia.nextDouble();
		System.out.println("Digite b");
		b=leia.nextDouble();
		System.out.println("Digite c");
		c=leia.nextDouble();
		media=((a*2)+(b*3)+(c*5))/10;
		System.out.println(media);
		
	}
}
