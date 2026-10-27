package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args) {
		int [] arr;
		arr = new int [10];
		int a = 5;
		Scanner sc = new Scanner(System.in);
		for( int i = 0;i<arr.length;i++) {
			System.out.println("Nhap phan tu thu "+(i+1)+": ");
			arr[i]= sc.nextInt();
		}
		int flag= 0;
		for( int i =0;i<arr.length;i++) {
			if(arr[i]==a)
				flag =1;
		}
		if(flag == 1)
			System.out.println("Tim thay");
	}
}
