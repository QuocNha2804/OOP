package iuh.fit.se.module1;

public class Bai10 {
	public static void main(String[] args) {
		int cnt =0;
		String a = " nha dep trai 123456";
		for( int i =0;i<a.length();i++) {
			if(a.charAt(i)>=48 && a.charAt(i)<=57)
				cnt++;
		}
		System.out.println("So lan xuat hien cua chu so: "+cnt);
	}

}
