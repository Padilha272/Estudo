package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int numero = 0 ;
		
		System.out.println("Digite um n�mero");
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
