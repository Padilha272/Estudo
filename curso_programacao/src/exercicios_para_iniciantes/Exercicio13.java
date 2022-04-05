package exercicios_para_iniciantes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		double renda =0.00;
		double imposto = 0.00;
		
		
		System.out.println("Digite o valor da sua renda");
		renda=leia.nextDouble();
		
		if(renda <=0 || renda <=2000.00) {
			System.out.println("Isento de imposto");
		}
		
		else if (renda>2000 && renda<=3000) {
			imposto = (renda-2000)*0.08;
			System.out.printf("R$ %.2f",imposto);
		} 
		
		else if (renda >3000 && renda<=4500) {
			imposto = (1000*0.08)+(renda-3000)*0.18;
			System.out.printf("R$ %.2f",imposto);
		}
		
		else {
			imposto = (1000*0.08)+(1500*0.18)+(renda-4500)*0.28;
			System.out.printf("R$ %.2f",imposto);
		}
		
		
		
		
		
		
		
	}

}
