package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 2 so a va b");
		a = sc.nextInt();
		b = sc.nextInt();
		while(a!=b) {
			if(a>b)
				a = a -b;
			else if(b>a)
				b = b-a;
		}
		System.out.println("Uoc chung lon nhat la: "+a);
		
	}
}
