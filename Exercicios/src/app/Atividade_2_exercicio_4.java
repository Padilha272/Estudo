package app;

import java.util.Scanner;

import entities.IdentidadeNumero;

public class Atividade_2_exercicio_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		IdentidadeNumero numero = new IdentidadeNumero(0);
		double a; 
		System.out.println("Digite um número: ");
		a=leia.nextDouble();
		numero.setNumero(a);
		numero.identidade(a);
		
		
	}

}
