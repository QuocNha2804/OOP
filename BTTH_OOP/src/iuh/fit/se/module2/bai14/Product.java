package iuh.fit.se.module2.bai14;

public class Product {
	private String description;
	private String productID;
	private double price;
	public Product() {
		this("","",0.0);
	}
	public Product(String description, String productID, double price) {
		this.description = description;
		this.productID = productID;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %5.2f", description, productID, price);
	}
	
	
}
