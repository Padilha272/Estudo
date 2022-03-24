package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		double l = 0.00;
		double c= 0.00;
		double metro=0.00;
		double area= 0.00;
		double preco=0.00;
		
		System.out.println("Digite o comprimento do terreno: ");
		c=leia.nextDouble();
		System.out.println("Digite a largura do terreno: ");
		l=leia.nextDouble();
		System.out.println("Qual o valor do metro quadrado? ");
		metro=leia.nextDouble();
		area = c*l;
		preco=metro*area;
		System.out.printf("A área do terreno é %.2f metros quadrados",area);
		System.out.println();
		System.out.printf("O preco do terreno é %.2f reais",preco);
		leia.close();
	}

}
