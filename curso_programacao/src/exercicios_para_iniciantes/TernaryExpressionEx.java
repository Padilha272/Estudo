package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class TernaryExpressionEx {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		/*Scanner leia = new Scanner (System.in);
		System.out.println("Digite o valor da compra: ");
		double preco = leia.nextDouble();
		double valor = (preco<20) ? preco*0.1 : preco*0.05;
		
		System.out.printf("Valor com desconto %.2f",valor);
		
		leia.close();*/
		
		System.out.print("Digite um número: ");
		int n = leia.nextInt();
		int a =0;
		char resp;
		do {
			System.out.print("Digite um número: ");
			int x = leia.nextInt();
			a = (n%x==0)? a+1:a;
			System.out.print("Quer continuar ?");
			resp = leia.next().charAt(0);
		}while (resp !='n');
		
		System.out.println(a);
	}

}
