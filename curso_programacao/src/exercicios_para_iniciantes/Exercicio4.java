package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		int numero=0;
		int horas=0;
		double valor =0.00;
		
		System.out.println("Digite o número do funcionário: ");
		numero=leia.nextInt();
		System.out.println("Digite o número de horas trabalhadas: ");
		horas=leia.nextInt();
		System.out.println("Qual o valor das horas trabalhadas ?");
		valor=leia.nextDouble();
		double salario = (horas*valor);
		System.out.printf("NUMBER = %d\n",numero);
		System.out.printf("SALARY = U$ %.2f\n",salario);
		
		leia.close();
	}

}
