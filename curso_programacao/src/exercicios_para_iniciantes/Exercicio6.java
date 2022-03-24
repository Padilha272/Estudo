package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		double a=0.00,b=0.00,c=0.00;
		System.out.println("Digite o valor de A: ");
		a=leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		b=leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		c=leia.nextDouble();
		double pi = 3.14159;
		double t1=(a*c)/2;
		double c1=(pi*(c*c));
		double tp1=(((a+b)*c)/2);
		double q1=(b*b);
		double r1=(a*b);
		System.out.printf("Área do triângulo: %.3f\n",t1);
		System.out.printf("Área do círculo: %.3f\n",c1);
		System.out.printf("Área do trapézio: %.3f\n",tp1);
		System.out.printf("Área do quadrado: %.3f\n",q1);
		System.out.printf("Área do retângulo: %.3f\n",r1);
	}

}
