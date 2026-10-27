package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu mang: ");
		n = sc.nextInt();
		int []arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			System.out.println("Nhap phan tu thu "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		int max = arr[0], min = arr[0];
		for( int i =0;i<arr.length;i++) {
			if(arr[i]> max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		for( int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" " );
		}
		System.out.print("\n");
		System.out.println("Gia tri lon nhat mang la: "+max);
		System.out.println("Gia tri nho nhat mang la: "+min);
	}

}
