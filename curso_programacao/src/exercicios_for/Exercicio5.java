package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		int valor=n;
		
		if(n==0) {
			valor =1;
		} else
		for(int i=1;i<=n;i++) {
			if(i<n) {
				valor = valor*(n-i);
				
			}
			
		}
		System.out.println(valor);
		
	}

}
