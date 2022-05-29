package comportamento_de_memoria;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite a quantidade de pessoas : ");
		int n = leia.nextInt();
		double vetor[] = new double[n];
		double media = 0;
		for (int i =0;i <n;i++){
			System.out.println("Digite a altura das pessoas");
			double valor = leia.nextDouble();
			vetor[i]=valor;
		}
		for (int i =0;i <n;i++) {
			media +=  vetor[i];
		}
		media = (media/n);
		System.out.printf("A média das pessoas é: %.2f",media);
		leia.close();
		
		
	}

}
