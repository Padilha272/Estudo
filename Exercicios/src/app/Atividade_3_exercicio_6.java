package app;

import java.util.Scanner;

public class Atividade_3_exercicio_6 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int a,b=0,i=0;
		double media;
		do {
			System.out.println("Digite um número: ");
			a=leia.nextInt();
			
			if(a%3==0 && a!=0) {
				b=b+a;
				i++;
			}
			
			
			
			
		}while(a!=0);
		media=b/i;
		System.out.println("Quantidade de múltiplos de 3: "+i);
		System.out.println("Média: "+media);
	}

}
