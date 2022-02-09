package app;

import java.util.Random;

public class Atividade_4_exercicio_3 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][6];
		int[][] matriz2 = new int[4][6];
		int[][] soma = new int[4][6];
		int[][] sub = new int[4][6];
		Random gerador = new Random();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				matriz[i][j] = (gerador.nextInt(5) + 1);
			}
		}

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				matriz2[x][y] = (gerador.nextInt(5) + 1);
			}
		}

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 6; y++) {
				soma[x][y] = (matriz[x][y] + matriz2[x][y]);
				sub[x][y] = (matriz[x][y] - matriz2[x][y]);
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.print("|");
			for (int j = 0; j < 6; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println("|");
		}

		System.out.println();

		for (int x = 0; x < 4; x++) {
			System.out.print("|");
			for (int y = 0; y < 6; y++) {

				System.out.print(matriz2[x][y] + " ");

			}
			System.out.println("|");
		}

		System.out.println();
		for (int x = 0; x < 4; x++) {
			System.out.print("|");
			for (int y = 0; y < 6; y++) {

				System.out.print(soma[x][y] + " ");

			}
			System.out.println("|");
		}

		System.out.println();

		for (int x = 0; x < 4; x++) {
			System.out.print("|");
			for (int y = 0; y < 6; y++) {

				System.out.print(sub[x][y] + " ");

			}
			System.out.println("|");
		}

	}

}
