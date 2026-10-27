package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dong va so cot: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		//a
		for( int i =1;i<=m;i++) {
			for(int j =1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("----------");
		//b
		for( int i =n;i>=1;i--) {
			for(int j =1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("----------");
		//c
		for( int i =1;i<=m;i++) {
			for(int j=1;j<=m-i;j++)
				System.out.print(" ");
			for( int j =1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("----------");
		//d
		for( int i =m;i>=1;i--) {
			for(int j=1;j<=m-i;j++)
				System.out.print(" ");
				System.out.print("*");
			System.out.println();
		}
		System.out.println("----------");
	}
	

}
