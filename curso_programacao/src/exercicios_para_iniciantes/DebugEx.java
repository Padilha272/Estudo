package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class DebugEx {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Largura: ");
		double largura = leia.nextDouble();
		System.out.println("Comprimento: ");
		double comprimento = leia.nextDouble();
		System.out.println("Valor do metro quadrado: ");
		double metroQuadrado = leia.nextDouble();
		
		double area = largura * comprimento;
		
		double preco = metroQuadrado*area;
		
		System.out.printf("AREA = %.2f\n",area);
		System.out.printf("PRECO = %.2f\n",preco);
		
		leia.close();
	}

}
