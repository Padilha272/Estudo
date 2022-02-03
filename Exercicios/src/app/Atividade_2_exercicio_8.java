package app;

import java.util.Scanner;

import entities.Numerica;

public class Atividade_2_exercicio_8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		Numerica valor = new Numerica(0);
		System.out.println("Digite o valor: ");
		numero=leia.nextInt();
		valor.setNumero(numero);
		valor.teste(valor.getNumero());
	}

}
