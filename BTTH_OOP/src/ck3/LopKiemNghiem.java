package ck3;

import java.time.LocalDate;
import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachNhanVien dsnv = new DanhSachNhanVien();
		dsnv.themNV(new NhanVienBienChe("NV01", "Tran Quoc Nha", LocalDate.of(2020, 4, 28), 3.5, TienDo.Co));
		dsnv.themNV(new NhanVienBienChe("NV02", "Do Minh Quan", LocalDate.of(2022, 6, 27), 3.7, TienDo.Khong));
		dsnv.themNV(new NhanVienHopDong("NV03", "Do Hoai Nho", LocalDate.of(2024, 8, 28), 25));
		dsnv.themNV(new NhanVienHopDong("NV04", "Dang Thanh Xuan", LocalDate.of(2022, 7, 9), 17));
		dsnv.themNV(new NhanVienHopDong("NV05", "Bui Quoc Thong", LocalDate.of(2021, 9, 8), 10));
		
		System.out.println("Danh sach nhan vien bien che: ");
		System.out.println(NhanVienBienChe.title());
		for (NhanVien nv : dsnv.getDSNV()) {
			if(nv instanceof NhanVienBienChe) {
				System.out.println(nv);
				
			}
		}

		System.out.println("Danh sach nhan vien hop dong: ");
		System.out.println(NhanVienHopDong.title());
		for (NhanVien nv : dsnv.getDSNV()) {
			if(nv instanceof NhanVienHopDong) {
				System.out.println(nv);
				
			}
		}
		System.out.println("Tong tien luong phai tra trong thang la: "+ dsnv.tongTienLuong());
		
		System.out.println("Nhap ma nhan vien muon sua");
		String maNV = sc.nextLine();
		System.out.println("Nhap so ngay cong can sua");
		int soNgayCong = sc.nextInt();
		
		System.out.println("Sua so ngay cong cua nhan vien: "+dsnv.suaSoNgayCong(maNV, soNgayCong));
		
		System.out.println("Nhap thang x");
		int x = sc.nextInt();
		System.out.println("Nhap nam y");
		int y = sc.nextInt();
		
		
		System.out.println("Danh sach nhan vien con ngay vao lam thang x nam y");
		for (NhanVien nv: dsnv.getDSNVLamThangXNamY(x, y)) {
			System.out.println(nv);
		}
		
		//sap xep nhan vien theo ten va theo ngay vao lam
		System.out.println("sap xep nhan vien theo ten va theo ngay vao lam");
		for (NhanVien nv : dsnv.sapXepTenVaNgayLam()) {
			System.out.println(nv);
		}
		
		// sap xep nhan vien theo ten va theo he so luong
		System.out.println("Sap xep nhan vien theo ten va he so luong");
		for (NhanVien nv : dsnv.sapXepTenVaHeSoLuong()) {
			System.out.println(nv);
		}
		
		//sap xep nhan vien theo ngay vao lam va so ngay lam va ten
		System.out.println("Sap xep nhan vien theo ngay vao lam va so ngay lam va ten");
		for (NhanVien nv : dsnv.sapXepTenNgayVaoLamVaSoNgayLam()) {
			System.out.println(nv);
		}
		
		
		//danh sach nhan vien co so ngay lam cao nhat
		System.out.println("Danh sach nhan vien co so ngay lam cao nhat");
		for (NhanVien nv : dsnv.getDSNVNgayLamMax()) {
			System.out.println(nv);
		}
		//xoa nhan vien theo ma
		System.out.println("Nhap ma nhan vien can xoa");
		String maNVXoa = sc.nextLine();
		System.out.println("Xoa nhan vien theo ma: "+dsnv.xoaNV(maNVXoa));
		sc.close();
	}
}
