package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ConverterApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolar = read.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double valor = read.nextDouble();
		double amount = CurrencyConverter.Converter(dolar, valor);
		System.out.printf("Amout do be paid in reais: %.2f",amount);
	}

}
