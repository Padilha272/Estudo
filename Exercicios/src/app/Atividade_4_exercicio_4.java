package app;

import java.util.Random;

public class Atividade_4_exercicio_4 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Random gerador = new Random();
		int soma=0,diagonal=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j]=gerador.nextInt(5)+1;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println("|");
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				soma=soma+matriz[i][j];
				if(i==j) {
					diagonal=diagonal+matriz[i][j];
				}
			}
		}
		
		System.out.println("Soma total: "+soma);
		System.out.println("Soma diagonal: "+diagonal);
		
	}

}
