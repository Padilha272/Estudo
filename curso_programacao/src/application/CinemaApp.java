package application;

import java.util.Scanner;

import entities.Cinema;


public class CinemaApp {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Cinema ingresso = new Cinema("", "", "");
		String nome ="",cpf="",tipo="";
		//ingresso.compraIngresso(nome, cpf, tipo);
		//ingresso.lugar();
		ingresso.uci();
		
	}

}
