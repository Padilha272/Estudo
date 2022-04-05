package exercicios_para_iniciantes;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		//Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.
		
		int x;
		int soma=0;
		
		System.out.println("Digite um número");
		x=leia.nextInt();
		
		while (x!=0) {
			System.out.println("Digite um número");
			soma = soma+x;		
			x=leia.nextInt();
			
		}
		
		System.out.println(soma);
		
		leia.close();
	}

}
