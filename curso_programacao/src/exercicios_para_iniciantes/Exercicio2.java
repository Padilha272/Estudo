package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		double raio = 0.00;
		double area=0.00;
		System.out.println("Digite o valor do raio: ");
		raio=leia.nextDouble();
		area = 3.14159*Math.pow(raio,2);
		System.out.printf("A área o círculo é igual a %.4f",area);
		
		
		
		
		
		leia.close();
	}

}
