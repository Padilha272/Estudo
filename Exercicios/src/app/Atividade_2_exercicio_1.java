package app;




import java.util.Scanner;

public class Atividade_2_exercicio_1 {
	
	public static void main(String args[]) {
		
		/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
	de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
	verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
	da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
	ZERO.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		
	
		
		double peso = 50;
		double P=0,E=0,M=0;
		
		System.out.println("Quantos quilos de tomate você gostaria ?");
		P=leia.nextDouble();
		if(P>50) {
			E= P-peso;
			M=E*4;
			System.out.println("O excesso de peso foi: "+E+"Kg e o valor da multa é de "+M+"R$");
		}else {
			System.out.println("não haverá multa");
		}
		
	}

}
