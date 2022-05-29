package comportamento_de_memoria;

import java.util.Scanner;

import entities.Product;

public class VetorProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite a quantidade de produtos: ");
		int n=leia.nextInt();		
		Product vetor[] = new Product[n];
		double media=0.00;
		for(int i = 0 ;i<vetor.length;i++) {
			leia.nextLine();
			System.out.println("Digite o nome do produto: ");
			String nome =leia.nextLine();
			System.out.println("Digite o preço do produto: ");
			double preco = leia.nextDouble();
			vetor[i]=new Product(nome,preco);
		}
		
		for(int i = 0;i<vetor.length;i++) {
			media+=vetor[i].getPrice();	
		}
		
		media=media/n;
		System.out.println("A média dos produtos é: "+media);
	
	}

}
