package exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int x = leia.nextInt();
		
		for (int i =1;i<=x;i++) {
			System.out.println(i+" "+(i*i)+" "+(i*i*i));
		}

	}

}
