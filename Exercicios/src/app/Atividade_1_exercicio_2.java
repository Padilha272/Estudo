package app;

import java.util.Scanner;
import java.lang.Math;
public class Atividade_1_exercicio_2 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double ano, mes, dia,idade;
		int anoint,mesint;
		System.out.println("Digite a sua idade em dias");
		idade=leia.nextInt();
		ano=idade/365;
		anoint=(int) (idade/365);
		
		mes=((ano-anoint)*365)/30;
		mesint=(int) mes;
		dia=(mes-mesint)*30;
	
		System.out.println("Sua idade em anos é igual a "+(int)ano);
		System.out.println("Sua idade em meses é igual a "+(int)mes);
		System.out.println("Sua idade em dias  "+Math.ceil(dia));
	}

}
