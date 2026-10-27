package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n;
		System.out.println("Nhap n");
		n = sc.nextInt();
		int tong =0, flag =0;
		int i =2;
		while(i<n) {
			for(int j =2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag =1;
					break;
				}
			}
			if(flag ==0) {
				tong += i;
			}
			else 
				flag = 0;
			i++;
		}
		System.out.println("Tong la: "+tong);
	}

}
