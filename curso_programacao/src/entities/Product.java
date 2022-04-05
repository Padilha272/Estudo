package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	public double total;
	
	public double totalValueInStock() {
		
		return price*quantity;
	}
	
	public void addProducts(int quantity) {
		
		this.quantity += quantity;
		total =  this.price*this.quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		total = this.price*this.quantity;
	}
	
	public String toString() {
		return name+", $"+String.format("%.2f", this.price)+", "+quantity+" units, Total: $"+String.format("%.2f", totalValueInStock());
	}
}
