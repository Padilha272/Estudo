package exercicios_para_iniciantes;

import java.util.Scanner;

public class SwichCaseExemplo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int x = leia.nextInt();
		String dia;
		
		switch (x) {
		
		case 1:
			dia = "Domingo";
			break;
		
		case 2:
			dia = "Segunda";
			break;
		
		case 3:
			dia = "Terça";
			break;
			
		case 4:
			dia = "Quarta";
			break;
				
		case 5:
			dia = "Quinta";
			break;
			
		case 6:
			dia = "Sexta";
			break;
			
		case 7:
			dia = "Sábado";
			break;
			
		 default :			 
			 dia = "Valor inválido";
			 break;
		
		
		
		}

		
		System.out.println("Dia da semana: "+dia);
		
		
		
		leia.close();
	}

}
