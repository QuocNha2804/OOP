package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		sc.nextLine();
		String [] arr = new String [n];
		for( int i =0;i< arr.length;i++) {
			System.out.println("Nhap chuoi thu "+(i+1)+":");
			arr[i]= sc.nextLine();
			
		}
		
		System.out.println("Nhap chuoi can tim: ");
		String string = sc.nextLine();
		
		
		int flag =0;
		for( String s : arr) {
			if(s.equals(string))
				flag =1;
		}
		if(flag ==1)
			System.out.println("Tim thay");
		else 
			System.out.println("Khong tim thay");
		
	}

}
