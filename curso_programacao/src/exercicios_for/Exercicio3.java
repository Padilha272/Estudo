package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		int n = leia.nextInt();
		double media =0.00;
		double a=0.00,b=0.00,c=0.00;
		for(int i=1;i<=n;i++) {
			a = leia.nextDouble();
			b = leia.nextDouble();
			c = leia.nextDouble();
			media = ((a*2)+(b*3)+(c*5))/10;
			System.out.printf("%.1f\n",media);
		}
		leia.close();
	}

}
