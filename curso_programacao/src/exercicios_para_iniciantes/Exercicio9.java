package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em 
		ordem crescente ou decrescente.*/
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int numero1 , numero2;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1=leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2=leia.nextInt();
		
		if((numero1%numero2==0)||(numero2%numero1==0)) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
	}

}
