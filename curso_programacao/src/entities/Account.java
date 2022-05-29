package entities;

public class Account {

	private int number;
	
	private String name;
	
	private double amount;

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmount() {
		
		return this.amount;
	}
	
	
	
	public double deposit(double amount) {
		
		return this.amount += amount;
	}
	
	public double withdraw(double amount) {
		
		return this.amount -= amount+5.0;
	}
	
	public String toString() {
		
		return "Account: "+this.number+ ", Holder: "+this.name+", Balance: $ "+this.amount;
	}
	
	
	
}
