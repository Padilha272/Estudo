package app;

import java.util.Scanner;

public class Atividade_3_exercicio_3 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int a=0,maior=0,menor=0;
		while(a!=-99) {
			System.out.println("Digite sua idade");
			a=leia.nextInt();
			if(a<21 && a!=-99) {
				menor++;
			}else if(a>50) {
				maior++;
			}
		}
		System.out.println("Pessoas com menos de 21: "+menor);
		System.out.println("Pessoas com mais de 50: "+maior);
		

	}

}
