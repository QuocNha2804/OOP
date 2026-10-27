package iuh.fit.se.module1;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		String a = "Tran Quoc Nhaaaaaaaa";
		int cnt=0;
		for( int i = 0; i<a.length();i++) {
			if(a.charAt(i)=='a')
				cnt++;
		}
		System.out.println("So lan a xuat hien: "+cnt);
	}

}
