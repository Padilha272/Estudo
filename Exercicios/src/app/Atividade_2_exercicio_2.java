package app;

import java.util.Scanner;
import entities.Funcionario;

public class Atividade_2_exercicio_2 {

	public static void main(String[] args) {
		
		/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
	excedente.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		Funcionario cara = new Funcionario(0,0,0,0);
		
		int C,N;
		double salario=0.0,E=0.0;
		
		System.out.println("Código: ");
		C=leia.nextInt();
		cara.setCodigo(C);
		System.out.println("Número de horas trablhadas: ");
		N=leia.nextInt();
		cara.setHoras(N);
		
		cara.sistema(C, N, salario, E);
		
		

	}

}
