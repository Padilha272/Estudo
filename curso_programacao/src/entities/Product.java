package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	private double total;
	
	public Product(String name,double price,int quantity ) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	
	
	public Product(String name,double price ) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	
	public String getName() {
		
		return this.name;
	}
	
	public double getPrice() {
		
		return this.price;
	}
	
	public void setPrice(double price) {
		
		this.price = price;
	}
	
	public int getQuantity() {
		
		return this.quantity;
	}
	
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
