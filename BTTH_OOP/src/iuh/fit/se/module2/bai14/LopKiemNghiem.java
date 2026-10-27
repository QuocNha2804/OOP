package iuh.fit.se.module2.bai14;

import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order lineItems = new Order(4);
		Product s1 = new Product("CaFe","M001",20000.0);
		Product s2 = new Product("Matuy","M002",25000.0);
		Product s3 = new Product("Thuocla","M003",27000.0);
		Product s4 = new Product("Muoi","M004",29000.0);
		lineItems.addItem(s1, 10);
		lineItems.addItem(s2, 10);
		lineItems.addItem(s3, 10);
		lineItems.addItem(s4, 10);
		OrderDetail[] temp = lineItems.getLineItems();
		for(OrderDetail p : temp)
			System.out.println(p);
		System.out.println(lineItems.calcTotalCharge());
		
	}
}
