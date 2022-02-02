package entities;

public class IdentidadeNumero {

	
	public double numero;

	public IdentidadeNumero(double numero) {
		super();
		this.numero = numero;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	
	public void identidade(double numero) {
		
		if(numero>0) {
			System.out.println("O número "+numero+" é positivo");
		}else if(numero<0) {
			System.out.println("O número "+numero+" é negativo");
		}else {
			System.out.println("O número é zero");
		}
		
		if((numero%2)==0) {
			System.out.println("O número "+numero+" é par");
		}else {
			System.out.println("O número "+numero+" é impar");
		}
	}
	
	
	
}
