package iuh.fit.se.module2.bai4;

import java.util.Scanner;

public class TestDiemSinhVien {
	public static void main(String[] args) {
		DiemSinhVien sv1 = new DiemSinhVien(2378345,"quoc nha", 5.0,9.0);
		DiemSinhVien sv2 = new DiemSinhVien(2875376,"minh quan",7.0, 9.0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien");
		int maSV = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten");
		String hoTen = sc.nextLine();
		System.out.println("Nhap diem ly thuyet");
		double diemLT = sc.nextDouble();
		System.out.println("Nhap diem thuc hanh");
		double diemTH = sc.nextDouble();
		DiemSinhVien sv3 = new DiemSinhVien(maSV,hoTen,diemLT,diemTH);
		System.out.printf("%-10s %-10s%10s %10s %10s\n","masv","hoten","diemlt","diemth","diemtrungbinh");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	}
}
