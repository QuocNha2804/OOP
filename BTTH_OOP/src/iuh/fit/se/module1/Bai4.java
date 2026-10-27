package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai4 {
	//Giai pt bac 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap a va b:");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a ==0) {
			if(b ==0)
				System.out.println("Vo so nghiem");
			else 
				System.out.println("Vo nghiem");
		}
		else
			System.out.println("Nghiem cua phuong trinh la: "+((double)-b/a));
			
	}

}
