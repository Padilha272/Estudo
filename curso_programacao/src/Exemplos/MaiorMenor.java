package Exemplos;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um n�mero");
		int n = leia.nextInt();//Representa o numero digitado pelo usu�rio
		
		int m = n;//Representa o maior n�mero da sequ�ncia digitada pelo usu�rio
		
		int menor =n; //Representa o menor n�mero da sequ�ncia digitada pelo usu�rio
		do {		
			System.out.print("Digite um n�mero: ");
			n = leia.nextInt();
				
			if(m<n) {
				m = n;
			}
			
			if (menor > n && n!=-1) {
				menor =n;
			}
		} while (n!=-1);
		
		
		System.out.println("O maior n�mero �: "+m);
		System.out.println("O menor valor �: "+menor);

	}

}
