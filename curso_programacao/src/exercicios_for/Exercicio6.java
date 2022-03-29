package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		for(int i=1;i<=n;i++) {
			
			if((n%i)==0) {
				System.out.println(i);
			}
		}
		
		leia.close();
	}

}
