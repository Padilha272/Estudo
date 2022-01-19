package app;

import java.util.Scanner;

public class Atividade_1_exercicio_6 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double x1,x2,y1,y2,d;
		System.out.println("Digite o valor de X1: ");
		x1=leia.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2=leia.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1=leia.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2=leia.nextDouble();
		d=Math.pow((Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)),0.5);
		System.out.println("O valor de D é igual a: "+d);
	}
}
