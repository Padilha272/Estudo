package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int minuto =0;
		double preco=0.00;
		
		System.out.println("Digite o número de minutos: ");
		minuto=leia.nextInt();
		
		if(minuto<=100) {
			preco = 50.00;
			System.out.printf("Valor a pagar: R$ %.2f",preco);
		}
		else {
			preco = (minuto-100)*2.00 + 50.00;
			System.out.printf("Valor a pagar: R$ %.2f",preco);
		}
	}

}
