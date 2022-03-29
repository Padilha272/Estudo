package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		
		
		double  a=0.00,b=0.00 ,divisao =0.00;
		for(int i=1;i<=n;i++) {
			a = leia.nextDouble();
			b = leia.nextDouble();
				if(b!=0) {
					divisao = a/b;
					System.out.println(divisao);
				}else {
					System.out.println("Divisao impossivel");
				}
		}
		leia.close();
	}

}
