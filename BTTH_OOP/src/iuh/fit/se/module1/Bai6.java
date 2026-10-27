package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai6 {
	//kiem tra snt
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Nhap so n:");
		int n = sc.nextInt();
		int flag =0;
		if(n < 2)
			System.out.println("Khong phai la so nghuyen to: ");
		else {
			for( int i =2;i<=Math.sqrt(n);i++) {
				if(n % i ==0) {
					System.out.println("Khong phai la so nguyen to");
					flag =1;
					break;
				}
			}
			if(flag ==0)
				System.out.println("La so nguyen to");
		}
	}

}
