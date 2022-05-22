package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class AlunoApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		Aluno aluno = new Aluno ();
		
		
		System.out.print("Enter first value: ");
		aluno.nota1 = leia.nextDouble();
		System.out.println("Enter second value: ");
		aluno.nota2 = leia.nextDouble();
		System.out.println("Enter third value: ");
		aluno.nota3 = leia.nextDouble();
		
		aluno.media(aluno.nota1, aluno.nota2, aluno.nota3);
		
		leia.close();
	}

}
