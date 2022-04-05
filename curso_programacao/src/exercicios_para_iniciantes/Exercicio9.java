package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		ordem crescente ou decrescente.*/
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int numero1 , numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1=leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2=leia.nextInt();
		
		if((numero1%numero2==0)||(numero2%numero1==0)) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
	}

}
