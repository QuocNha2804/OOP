package demo7;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap chuoi");
		s = sc.nextLine();
		System.out.println("Do dai chuoi la: "+ s.length());
		for(int i =0;i<s.length();i++) {
			System.out.println("Ki tu tai vi tri thu "+ i + " la: "+s.charAt(i));
		}
	}
}
