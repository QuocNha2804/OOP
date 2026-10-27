package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		int x1=1, x2=1, tmp;
		System.out.print(x1+" "+x2+" ");
		for(int i = 3;i<=n;i++) {
			tmp = x1;
			x1 = x2;
			x2 = tmp + x2;
			System.out.print(x2+" ");
		}
	}

}
