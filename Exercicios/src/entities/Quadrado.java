package entities;

public class Quadrado {

	public int n1;
	public int n2;
	public int n3;
	public int n4;
	
	public Quadrado(int n1, int n2, int n3, int n4) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

	public int getN4() {
		return n4;
	}

	public void setN4(int n4) {
		this.n4 = n4;
	}
	
	public void operacao(int n1,int n2,int n3,int n4) {
		if ((n3*n3)>1000) {
			System.out.println(n3*n3);
		}else {
			System.out.println(n1+" quadrado: "+(n1*n1));
			System.out.println(n2+" quadrado: "+(n2*n2));
			System.out.println(n3+" quadrado: "+(n3*n3));
			System.out.println(n4+" quadrado: "+(n4*n4));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
