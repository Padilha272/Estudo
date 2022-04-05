package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		seguir, calcule e mostre o valor da conta a pagar.*/
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("CÓDIGO ESPECIFICAÇÃO    PREÇO");
		System.out.println("1      Cachorro quente  R$ 4.00");
		System.out.println("2      X-Salada         R$ 4.50");
		System.out.println("3      X-Bacon          R$ 5.00");
		System.out.println("4      Torrada simples  R$ 2.00");
		System.out.println("5      Refrigerante     R$ 1.50");
		
		int pedido = 0;
		int quantidade =0;
		double valor=0.00;
		System.out.println("Digite o código do produto que deseja comprar: ");
		pedido=leia.nextInt();
		
		System.out.println("Digite a quantidade que deseja comprar: ");
		quantidade=leia.nextInt();
		
		if (pedido==1) {
			valor  = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f",valor);
		}
		
		else if(pedido ==2) {
			valor  = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f",valor);
		}
		
		else if(pedido ==3) {
			valor  = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f",valor);
		}
		
		else if(pedido ==4) {
			valor  = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f",valor);
		}
		
		else if(pedido ==5) {
			valor  = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f",valor);
		}
		
		else {
			System.out.println("Por favor, digite um número válido");
		}
		
		
		
	}

}
