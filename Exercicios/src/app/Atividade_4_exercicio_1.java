package app;

import java.util.Scanner;

public class Atividade_4_exercicio_1 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int vetor[] = new int[5];
		int nota;
		int maior=0;
		for(int i=0;i<5;i++) {
			System.out.println("Digite a nota: ");
			nota=leia.nextInt();
			vetor[i]=nota;
		}
		System.out.print("[ ");
		for(int i=0;i<5;i++) {
			System.out.print(vetor[i]+" ");
			if(vetor[i]>maior) {
				maior=vetor[i];
			}
		}
		System.out.println("]");
		System.out.println("O maior valor é "+maior);
	}

}
