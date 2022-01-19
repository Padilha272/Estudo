package app;

import java.util.Scanner;

public class Atividade_1_exercicio_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		double d,r,s;
		System.out.println("Digite o valor de A: ");
		a=leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b=leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c=leia.nextInt();
		r=Math.pow((a+b),2);
		s=Math.pow((b+c),2);
		System.out.println("R= "+r);
		System.out.println("S= "+s);
	}

}
