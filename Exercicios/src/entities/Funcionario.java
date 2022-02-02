package entities;

public class Funcionario {

	public int codigo;
	public int horas;
	public double salario;
	public double excedente;
	
	
	public Funcionario(int codigo, int horas, double salario, double excedente) {
		super();
		this.codigo = codigo;
		this.horas = horas;
		this.salario = salario;
		this.excedente = excedente;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getExcedente() {
		return excedente;
	}


	public void setExcedente(double excedente) {
		this.excedente = excedente;
	}
	
	
	public void sistema(int codigo,int horas,double salario,double excedente) {
		
		if(horas>50) {
			salario = 500.0;
			excedente= (horas-50)*20;
			
			
		}else {
			salario = horas*10;
		}
		
		System.out.println("Código:"+codigo);
		System.out.println("Horas trabalhadas: "+horas);
		System.out.println("Salário total: "+salario+"R$");
		System.out.println("Salário excedente: "+excedente+"R$");
		System.out.println("Total + excedente: "+(salario+excedente)+"R$");
	}
	
	
}
