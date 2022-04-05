package exercicio_do_while;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		char a;
		do {
			System.out.print("Digite o valor em Celsius: ");
			double c = leia.nextDouble();
			double f= ((9*c)/5) + 32;
			System.out.printf("Valor em Fahrenheit: %.1f%n",f);
		System.out.println("Quer continuar ?");
		a = leia.next().charAt(0);
		} while(a!='n');
		
		leia.close();
	}

}





