package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int n,tong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so n: ");
		n = sc.nextInt();
		if( n%2 ==0)
			tong = n/2*(n/2+1);
		else
			tong = n*(n+1)/2 - (n-1)/2*((n-1)/2+1);
		System.out.println("Ket qua: "+tong);
	}
	

}
