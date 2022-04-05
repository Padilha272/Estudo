package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int numero = 0 ;
		
		System.out.println("Digite um número");
		numero=leia.nextInt();
		
		if (numero%2==0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		
		leia.close();
	}

}
