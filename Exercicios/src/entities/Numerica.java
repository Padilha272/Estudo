package entities;

public class Numerica {

	public int numero;

	public Numerica(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void teste(int numero) {
		if(numero >100) {
			System.out.println(numero);
		}
		else {
			System.out.println("0");
		}
	}
	
	
	
	
}
