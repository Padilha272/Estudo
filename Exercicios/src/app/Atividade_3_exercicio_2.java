package app;

import java.util.Scanner;

public class Atividade_3_exercicio_2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int a,par=0,impar=0;
		for(int i=1; i<=10;i++) {
			
				System.out.println("Digite um número");
				a=leia.nextInt();
				if(a%2==0) {
					par++;
				}else {
					impar++;
				}
		}
		System.out.println("Pares: "+par);
		System.out.println("Impares: "+impar);
	}

}
