package app;

import java.util.Scanner;
import entities.Funcionario;

public class Atividade_2_exercicio_2 {

	public static void main(String[] args) {
		
		/*2) Elabore um sistema que leia as vari?veis C e N, respectivamente c?digo e n?mero de
	horas trabalhadas de um oper?rio. E calcule o sal?rio sabendo-se que ele ganha R$ 10,00
	por hora. Quando o n?mero de horas exceder a 50 calcule o excesso de pagamento
	armazenando-o na vari?vel E, caso contr?rio zerar tal vari?vel. A hora excedente de
	trabalho vale R$ 20,00. No final do processamento imprimir o sal?rio total e o sal?rio
	excedente.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario cara = new Funcionario(0,0,0,0);
		
		int C,N;
		double salario=0.0,E=0.0;
		
		System.out.println("C?digo: ");
		C=leia.nextInt();
		cara.setCodigo(C);
		System.out.println("N?mero de horas trablhadas: ");
		N=leia.nextInt();
		cara.setHoras(N);
		
		cara.sistema(C, N, salario, E);
		
		

	}

}
