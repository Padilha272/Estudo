package entities;

public class Employee {
	
	public String name;
	
	public double grossSalary;
	
	public double tax;
	
	public double increse;
	
	public double salary() {
		
		return (this.grossSalary-this.tax);
	}
	
	public double increseSalary(double increse) {
		return this.grossSalary=this.grossSalary+(this.grossSalary*increse/100);
	}
	
	public String toString(){
		 return name+"\nSalary: "+salary()+"\n ";
	}
}
