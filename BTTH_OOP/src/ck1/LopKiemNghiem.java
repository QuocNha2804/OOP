package ck1;


import java.util.Scanner;

public class LopKiemNghiem {
		public static void main(String[] args) {
		DanhSachNhanVien dsnv = new DanhSachNhanVien();
		khoiTaoDanhSach(dsnv);
		int chon;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap menu (Nhap 0 de thoat)\n"
					+ "1: Them nhan vien\n"
					+ "2: In danh sach\n"
					+ "3: Thong ke luong trung binh\n"
					+ "4: Loc nvbh ko co thu nhap tang them\n"
					+ "5: Loc nvbh co doanh so ban lon nhat\n"
					+ "6: Cap nhat he so luong cua nhan vien khi biet ma so\n"
					+ "7: Sap xep nhan vien theo tien luong\n"
					+ "8: Sap xep theo ten\n"
					+ "9: Sap xep giam dan theo doanh so cua nhan vien ban hang\n");
			chon = sc.nextInt();
			sc.nextLine();
			switch(chon) {
			case 1 ->{
				System.out.println("Nhap loai nhan vien muon nhap");
				String loaiNhanVien = sc.nextLine();
				System.out.println("Nhap ma nhan vien");
				String maNV = sc.nextLine();
				System.out.println("Nhap ho va tern nhan vien");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhap so dien thoai");
				String soDienThoai = sc.nextLine();
				System.out.println("Nhap luong co ban");
				double luongCoBan = sc.nextDouble();
				if(loaiNhanVien.equalsIgnoreCase("Nhan Vien Ban Hang")) {
					System.out.println("Nhap doanh so ban");
					double doanhSoBan = sc.nextDouble();
					System.out.println("Ket qua them la: "+dsnv.themNV(new NhanVienBanHang(maNV,hoVaTen, soDienThoai, luongCoBan, doanhSoBan)));
				}
				else if(loaiNhanVien.equalsIgnoreCase("Nhan Vien Van Phong")) {
					System.out.println("Nhap he so luong");
					double heSoLuong = sc.nextDouble();
					System.out.println("Ket qua them la: "+dsnv.themNV(new NhanVienVanPhong(maNV, hoVaTen, soDienThoai, luongCoBan, heSoLuong)));
				}
				else {
					System.out.println("Loai nhan vien khong hop le");
					
				}
				
			}
			case 2 ->{
				dsnv.getDanhSach();
			}
			case 3->{
				System.out.println("Luong trung binh cua Nhan vien ban hang la: "+dsnv.thongKeLuongTrungBinh().get("NhanVienBanHang"));
				System.out.println("Luong trung binh cua Nhan vien van phong la: "+dsnv.thongKeLuongTrungBinh().get("NhanVienVanPhong"));
			}
			case 4->{
				for (NhanVien nv : dsnv.dsNVKhongCoThuNhapTangThem()) {
					System.out.println(nv);
				}
			}
			case 5->{
				for(NhanVien nv : dsnv.dsNVCoDoanhSoBanLonNhat()) {
					System.out.println(nv);
				}
			}
			case 6 ->{
				System.out.println("Nhap ma nhan vien muon cap nhat");
				String maNV = sc.nextLine();
				System.out.println("Nhap he so luong can thay doi");
				double heSoLuong = sc.nextDouble();
				System.out.println("Ket qua cap nhat la: "+ dsnv.capNhat(maNV, heSoLuong));
			}
			case 7 ->{
				for (NhanVien nv : dsnv.sapXepTheoTienLuong()) {
					System.out.println(nv);
				}
			}
			case 8 ->{
				for (NhanVien nv: dsnv.sapXepTheoTen()) {
					System.out.println(nv);
				}
			}
			case 9 ->{
				for (NhanVien nv : dsnv.sapXepTheoDoanhSoNVBH()) {
					System.out.println(nv);
				}
			}
			}
		}while(chon !=0);
		sc.close();
		}
		
		public static void khoiTaoDanhSach(DanhSachNhanVien dsnv) {
			dsnv.themNV(new NhanVienBanHang("NV001","Tran Quoc Nha","012345", 1800000.0, 500000000.0));
			dsnv.themNV(new NhanVienBanHang("NV002","Dang Thanh Xuan","023764", 1800000.0, 4000000.0));
			dsnv.themNV(new NhanVienBanHang("NV003","Bui Quoc Thong","035656", 1800000.0, 25000000.0));
			dsnv.themNV(new NhanVienVanPhong("NV004","Do Hoai Nho","3455445", 1800000.0, 1.9));
			dsnv.themNV(new NhanVienVanPhong("NV005","Do Minh Quan","564535", 1800000.0, 5.2));
		}
		
}
