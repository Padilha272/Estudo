package app;




import java.util.Scanner;

public class Atividade_2_exercicio_1 {
	
	public static void main(String args[]) {
		
		/*1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
	de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
	verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
	da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
	ZERO.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		
	
		
		double peso = 50;
		double P=0,E=0,M=0;
		
		System.out.println("Quantos quilos de tomate voc� gostaria ?");
		P=leia.nextDouble();
		if(P>50) {
			E= P-peso;
			M=E*4;
			System.out.println("O excesso de peso foi: "+E+"Kg e o valor da multa � de "+M+"R$");
		}else {
			System.out.println("n�o haver� multa");
		}
		
	}

}
