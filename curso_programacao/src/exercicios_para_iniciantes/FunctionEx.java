package exercicios_para_iniciantes;

import java.util.Scanner;

public class FunctionEx {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero=0 ;
		
		 double valor = media (numero);
		
		imprimir(valor);
		
		leia.close();

	}
	
	public static double media ( int x) {
		Scanner leia = new Scanner (System.in);
		double valor = 0;
		int i =0;
		char resp;
		do {
			System.out.println("Digite um valor: ");
			x = leia.nextInt();
			i++;
			valor = valor + x;
			System.out.println("Deseja continuar ?");
			resp = leia.next().charAt(0);
		}while (resp !='n');
		valor = valor/i;
		return valor;
	}
	
	public static void imprimir (double y) {
		System.out.println(y);
	}

}
