package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o c�digo a pe�a 1: ");
		int p1=leia.nextInt();
		System.out.println("Digite o n�mero de pe�as: ");
		int n1=leia.nextInt();
		System.out.println("Digite o valor da pe�a 1: ");
		double v1=leia.nextDouble();
		double preco1 = v1*n1;
		
		System.out.println("Digite o c�digo a pe�a 2: ");
		int p2=leia.nextInt();
		System.out.println("Digite o n�mero de pe�as: ");
		int n2=leia.nextInt();
		System.out.println("Digite o valor da pe�a 2: ");
		double v2=leia.nextDouble();
		double preco2 = v2*n2;
		
		double total = preco1+preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		
		leia.close();
		

	}

}
