package entities;

public class Triangulo {

	public double altura;
	public double base;
	public double area;

	public Triangulo(double altura, double base, double area) {
		super();
		this.altura = altura;
		this.base = base;
		this.area = area;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void area(double altura, double base, double area) {
		if (altura > 0 && base > 0) {
			area = (base * altura);
			System.out.println(area);
		} else {
			System.out.println("Você digitou um valor inválido!");
		}

	}

}
