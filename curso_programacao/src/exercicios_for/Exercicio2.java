package exercicios_for;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int N = leia.nextInt();
		
		int in =0;
		int o =0;
		int x=0;
		for(int i=1;i<=N;i++) {
			System.out.println("Digite um valor inteiro");
			x=leia.nextInt();
			if((x>=10)&&(x<=20)){
				in++;
			} else {
				o++;
			}
		}
		System.out.println(in+" in");
		System.out.println(o+" out ");
		leia.close();
	}

}
