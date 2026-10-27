package iuh.fit.se.module2.bai14;

public class OrderDetail {
	private int quantity;
	private Product product;
	public OrderDetail() {
		this.quantity = 0;
		this.product = null;
	}
	public OrderDetail(int quatity, Product product) {
		if(quantity <=20 && quantity >=0)
			this.quantity=quatity;
		this.product = product;
	}
	public int getQuatity() {
		return quantity;
	}
	public void setQuatity(int quatity) {
		this.quantity = quatity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double calcTotalPrice() {
		double total = (double) quantity* product.getPrice();
		return total;
	}
	@Override
	public String toString() {
		return String.format("%-5d %-10s %5.2f",quantity,product,calcTotalPrice());
	}
	
}
