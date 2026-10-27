package iuh.fit.se.module2.bai14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail [] lineItems;
	private int count =0;
	public Order() {
		this(0,LocalDate.now());
	}
	public Order(int orderId, LocalDate orderDate) {
		this.orderID= orderId;
		this.orderDate= orderDate;
	}
	public Order(int n) {
		if(n<0)
			throw new RuntimeException("n > 0");
		else
			lineItems = new OrderDetail[n];
	}
	public void addItem(Product product, int quantity) {
		if(count == lineItems.length) {
			int newLength = (int)(lineItems.length*1.5);
			OrderDetail[] temp = new OrderDetail[newLength];
			for(int i =0;i<count;i++) {
				temp[i] = lineItems[i];
			}
			lineItems = temp;
		}
		lineItems[count++] = new OrderDetail(quantity, product);
		
	}
	public double calcTotalCharge() {
		double total =0;
		for(int i =0;i<count;i++) {
			total += lineItems[i].calcTotalPrice();
		}
		return total;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + Arrays.toString(lineItems)
				+ ", count=" + count + "]";
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public OrderDetail[] getLineItems() {
		return lineItems;
	}
	

		
		
	
	
}
