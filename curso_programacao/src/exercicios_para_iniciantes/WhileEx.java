package exercicios_para_iniciantes;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		//Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final mostra a soma dos n�meros lidos.
		
		int x;
		int soma=0;
		
		System.out.println("Digite um n�mero");
		x=leia.nextInt();
		
		while (x!=0) {
			System.out.println("Digite um n�mero");
			soma = soma+x;		
			x=leia.nextInt();
			
		}
		
		System.out.println(soma);
		
		leia.close();
	}

}
