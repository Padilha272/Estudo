package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int numero = 0 ;
		
		System.out.println("Digite um n�mero: ");
		numero=leia.nextInt();
		
		if(numero<0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		leia.close();
	}

}
