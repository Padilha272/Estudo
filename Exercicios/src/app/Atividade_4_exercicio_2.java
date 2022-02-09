package app;

import java.util.Random;
import java.util.Scanner;
public class Atividade_4_exercicio_2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		Random gerador = new Random();
		int maior=0;
		int cont=0;
		int soma=0;
		double media;
		int vetor[] = new int[5];
		for(int i=0;i<5;i++) {
			vetor[i]=(gerador.nextInt(6)+1);
		}
		System.out.print("[ ");
		for(int i=0;i<5;i++) {
			System.out.print(vetor[i]+" ");
			if(vetor[i]>maior) {
				maior=vetor[i];
			}
		}
		System.out.println("]");
		for(int i=0;i<5;i++) {
			soma=soma+vetor[i];
			if(vetor[i]==maior) {
				cont++;
			}
		}
		media = soma/5.0;
		System.out.println("Média: "+media);
		System.out.println("Número de ocorrências do maior resultado: "+cont);

	}

}
