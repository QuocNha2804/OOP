package iuh.fit.se.module4.bai4;

import java.util.ArrayList;
import java.util.List;

public class LopKiemNghiem {
	public static void main(String[] args) {
		List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
		DanhSachSinhVien dssv = new DanhSachSinhVien(dsSinhVien);
		
		SinhVien sv1 = new SinhVien("001","Quoc Nha",2005);
		SinhVien sv2 = new SinhVien("002","Quoc Thong",2005);
		SinhVien sv3 = new SinhVien("003","Minh Quan",2005);
		dssv.themSV(sv1);
		dssv.themSV(sv2);
		dssv.themSV(sv3);
		System.out.println("Danh Sach Sinh Vien La");
		for (SinhVien sv : dssv.getDSSV()) {
			System.out.println(sv);
		}
		System.out.println("Xoa sinh vien co ma la 001: " + dssv.xoaSV("001"));
		System.out.println("Danh Sach Sinh Vien La");
		for (SinhVien sv : dssv.getDSSV()) {
			System.out.println(sv);
		}
		System.out.println("Tim kiem sinh vien co ma la 002: "+dssv.timKiem("002"));
		dssv.themSV(sv1);
		System.out.println("Danh Sach Sinh Vien La");
		for (SinhVien sv : dssv.getDSSV()) {
			System.out.println(sv);
		}
		dssv.sapxep();
		System.out.println("Danh Sach Sinh Vien Sap Xep La");
		for (SinhVien sv : dssv.getDSSV()) {
			System.out.println(sv);
		}
	}
}
