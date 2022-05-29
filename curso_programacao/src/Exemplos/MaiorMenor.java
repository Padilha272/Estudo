package Exemplos;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número");
		int n = leia.nextInt();//Representa o numero digitado pelo usuário
		
		int m = n;//Representa o maior número da sequência digitada pelo usuário
		
		int menor =n; //Representa o menor número da sequência digitada pelo usuário
		do {		
			System.out.print("Digite um número: ");
			n = leia.nextInt();
				
			if(m<n) {
				m = n;
			}
			
			if (menor > n && n!=-1) {
				menor =n;
			}
		} while (n!=-1);
		
		
		System.out.println("O maior número é: "+m);
		System.out.println("O menor valor é: "+menor);

	}

}
