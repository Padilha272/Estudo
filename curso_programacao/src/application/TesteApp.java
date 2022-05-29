package application;

import java.util.Scanner;

import entities.Teste;

public class TesteApp {
	
	public static void main(String[] args) {
	
		
		Scanner leia =new Scanner(System.in);
		Teste pessoa = new Teste("","",0);
		
		System.out.print("Digite o seu nome: ");
		String nome = leia.nextLine();
		pessoa.setName(nome);
		
		System.out.print("Digite o seu CPF: ");
		String cpf = leia.nextLine();
		pessoa.setCpf(cpf);
		
		System.out.print("Digite a sua idade: ");
		int idade = leia.nextInt();
		pessoa.setIdade(idade);
		
		System.out.println(pessoa.toString());
		
		
		
		
		
}
	
	
	
	
	
	
}
