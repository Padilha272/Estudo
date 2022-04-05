package exercicios_while;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite a senha: ");
		int senha = leia.nextInt();
		
		while (senha!=2002) {
			System.out.println("Senha inválida!");
			System.out.println("Digite a senha: ");
			senha = leia.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		leia.close();
	}

}
