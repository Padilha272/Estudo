package app;

import java.util.Scanner;

import entities.Nadador;

public class Atividade_2_exercicio_5 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		Nadador aluno = new Nadador(0,"");
		System.out.println("Nome do aluno: ");
		nome=leia.next();
		aluno.setNome(nome);
		System.out.println("Digite a idade: ");
		idade=leia.nextInt();
		aluno.setIdade(idade);
		aluno.classificacao(aluno.getIdade(),aluno.getNome());
	}
	

}
