package app;

import java.util.Scanner;
import java.lang.Math;
public class Atividade_1_exercicio_3 {

	
	
	public static void main(String arg[]) {
	Scanner leia = new Scanner(System.in);	
	double tempo;
	double hora,minuto,segundo;
	System.out.println("Digite o tempo em segundos");
	tempo= leia.nextInt();
	
	hora= tempo/3600;
	minuto= (hora - (int)hora)*60;
	segundo=(minuto-(int)minuto)*60;
	
	
	System.out.println((int)hora+" hora(s), "+(int)minuto+" minuto(s) e "+Math.ceil(segundo)+" segundo(s)");
	
	
	
	
	
	
	
	
	}
}
