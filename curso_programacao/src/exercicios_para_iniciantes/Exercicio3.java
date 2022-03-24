package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		int A=0,B=0,C=0,D=0;
		int DIFERENCA=0;
		System.out.println("Digite o valor de A: ");
		A=leia.nextInt();
		System.out.println("Digite o valor de B: ");
		B=leia.nextInt();
		System.out.println("Digite o valor de C: ");
		C=leia.nextInt();
		System.out.println("Digite o valor de D: ");
		D=leia.nextInt();
		DIFERENCA=((A*B)-(C*D));
		
		System.out.println("Diferença: "+DIFERENCA);
		leia.close();
	}

}
