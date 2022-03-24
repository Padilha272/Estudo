package exercicios_para_iniciantes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int n1=0;
		int n2=0;
		int soma=0;
		
		System.out.println("Primeiro número");
		n1=leia.nextInt();
		System.out.println("Segundo número");
		n2=leia.nextInt();
		soma=n1+n2;
		System.out.println("A soma dos valores é: "+soma);
		leia.close();
	}

}
