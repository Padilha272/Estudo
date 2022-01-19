package app;

import java.util.Scanner;

public class atividade_1_exercicio_1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia,mes,ano,idade;
		
		System.out.println("Digite a quantidade de anos");
		ano=leia.nextInt();
		System.out.println("Digite a quantidade de meses");
		mes=leia.nextInt();
		System.out.println("Digite a quantidade de dias");
		dia=leia.nextInt();
		
		idade=((ano*365)+(mes*30)+(dia));
		
		System.out.println("A sua idade expressa em dias é igual a: "+idade);
		
		
	}

}
