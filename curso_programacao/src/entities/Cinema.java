package entities;

import java.util.Scanner;

public class Cinema {

	private String nome;
	private String cpf;
	private String tipo;
	public int [][] matriz = new int[3][3];
	
	public Cinema(String nome, String cpf, String tipo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	Scanner leia = new Scanner(System.in);
	

	public void uci() {
		
		String [][] matriz = new String [3][3];
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				matriz[l][c]="O";
			}
		}
		int opcao;
		
		do {
		System.out.println("Menu");
		System.out.println("1-Ver lugares disponíveis");
		System.out.println("2-Comprar ingresso");
		System.out.println("3-Sair");
		opcao=leia.nextInt();
		switch (opcao) {
		
		case 1:
			
			for(int l=0;l<3;l++) {
				for(int c=0;c<3;c++) {
					System.out.print(matriz[l][c]+" ");;
				}
				System.out.println(" ");
			}
			
			
		break;
		
		case 2:
			int i,j;
			String lugar[][]=new String[3][3];
			System.out.println("Linha:");
			i=leia.nextInt();
			System.out.println("Coluna:");
			j=leia.nextInt();
			for(int l=0;l<3;l++) {
				for(int c=0;c<3;c++) {
					if(matriz[i][j]=="O") {
						matriz[i][j]="X";
						System.out.println("Poltrona: ["+i+"]"+"["+j+"]");
						System.out.println("Ingresso comprado por sucesso!");
						
					}
				}
				
			}
			
			
		break;
		
		}
		
	} while (opcao!=3);
	}
	
		
	
	
	
	
	
	
}
