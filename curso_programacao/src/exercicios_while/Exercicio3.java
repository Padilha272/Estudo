package exercicios_while;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		System.out.println("----------------------");
		System.out.println("Posto de combustíveis");
		System.out.println("----------------------");
		System.out.println();
		System.out.println("1-Álcool");
		System.out.println("2-Gasolina");
		System.out.println("3-Diesel");
		System.out.println("4-fim");
		System.out.println("Faça o seu pedido:");
		int pedido = leia.nextInt();
		int alcool=0;
		int gasolina=0;
		int diesel=0;
		
		switch (pedido) {
		
		case 1:
			alcool++;
			break;
		case 2:
			gasolina++;
			break;
		case 3:
			diesel++;
			break;
		default:
			System.out.println("Digite um código válido");
			break;
		}
		
		while (pedido!=4) {
			System.out.println("Faça o seu pedido:");
			pedido = leia.nextInt();
			switch (pedido) {
				
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			default:
				System.out.println("Digite um código válido");
				break;
			}
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		
		leia.close();
	}

}
