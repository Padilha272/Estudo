package app;

import java.util.Scanner;

import entities.Quadrado;

public class Atividade_2_exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Quadrado numero = new Quadrado(0,0,0,0);
		
		int n1,n2,n3,n4;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1=leia.nextInt();
		numero.setN1(n1);
		System.out.println("Digite o segundo n�mero: ");
		n2=leia.nextInt();
		numero.setN2(n2);
		System.out.println("Digite o terceiro n�mero: ");
		n3=leia.nextInt();
		numero.setN3(n3);
		System.out.println("Digite o quarto n�mero: ");
		n4=leia.nextInt();
		numero.setN4(n4);
		
		numero.operacao(n1, n2, n3, n4);
		
		
		
		
		
		
		
		
		
		
	}

}
