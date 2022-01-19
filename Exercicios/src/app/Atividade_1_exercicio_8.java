package app;

import java.util.Scanner;

public class Atividade_1_exercicio_8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custo,valor;
		
		System.out.println("Custo do carro(em RS): ");
		custo=leia.nextDouble();
		
		valor=custo+(custo*0.28)+(custo*0.45);
		System.out.println("O consumidor irá pagar: "+valor);
	}

}
