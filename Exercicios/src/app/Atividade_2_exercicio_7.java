package app;

import java.util.Scanner;

import entities.Triangulo;

public class Atividade_2_exercicio_7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Triangulo trikas = new Triangulo(0,0,0);
		
		double base=0,altura=0,area=0;
		
		System.out.println("Digite o valor da base: ");
		base=leia.nextDouble();
		trikas.setBase(base);
		System.out.println("Digite o valor da altura: ");
		altura=leia.nextDouble();
		trikas.setAltura(altura);
		trikas.area(altura, base, area);
		
	}

}
