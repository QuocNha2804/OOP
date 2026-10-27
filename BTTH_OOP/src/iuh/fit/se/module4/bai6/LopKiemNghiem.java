package iuh.fit.se.module4.bai6;

import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon;
		DanhSachPhong dsp = new DanhSachPhong();
		khoitaods(dsp);
		do {
			
			System.out.println("Nhap lua chon(Nhap 0 de thoat\n"
					+"1: Them\n"
					+"2: Tim kiem khi biet ma phong\n"
					+"3: In danh sach\n"
					+"4: Danh sach phong dat chuan\n"
					+"5: Sap xep danh sach tang dan theo day nha\n"
					+"6: Sap xep danh sach giam dan theo dien tich\n"
					+"7: Sap xep danh sach tang dan theo so bong den\n"
					+"8: Cap nhat so may tinh cua phong may tinh\n"
					+"9: Xoa phong hoc khi biet ma phong\n"
					+"10: Tinh tong so phong hoc\n"
					+"11: Danh sach phong hoc co 60 may\n");
			chon =sc.nextInt();
			switch(chon) {
			case 1 -> {
				sc.nextLine();
				System.out.println("Nhap loai phong muon them");
				String loaiPhong = sc.nextLine();
				Phong temp;
				if(loaiPhong.equalsIgnoreCase("PhongLyThuyet")) {
					System.out.println("Nhap ma phong");
					String maPhong = sc.nextLine();
					System.out.println("Nhap day phong");
					String dayPhong = sc.nextLine();
					System.out.println("Nhap dien tich");
					double dienTich = sc.nextDouble();
					sc.nextLine();
					System.out.println("Nhap so bong den");
					int soBongDen = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhap so may chieu");
					int soMayChieu = sc.nextInt();
					temp = new PhongLyThuyet(maPhong, dayPhong, dienTich, soBongDen, soMayChieu);
					dsp.themPhong(temp);
				}
				else if(loaiPhong.equalsIgnoreCase("PhongMayTinh")) {
					System.out.println("Nhap ma phong");
					String maPhong = sc.nextLine();
					System.out.println("Nhap day phong");
					String dayPhong = sc.nextLine();
					System.out.println("Nhap dien tich");
					double dienTich = sc.nextDouble();
					sc.nextLine();
					System.out.println("Nhap so bong den");
					int soBongDen = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhap so may tinh");
					int soMayTinh = sc.nextInt();
					temp = new PhongMayTinh(maPhong, dayPhong, dienTich, soBongDen, soMayTinh);
					dsp.themPhong(temp);
				}
				else if(loaiPhong.equalsIgnoreCase("PhongThiNghiem")){
					System.out.println("Nhap ma phong");
					String maPhong = sc.nextLine();
					System.out.println("Nhap day phong");
					String dayPhong = sc.nextLine();
					System.out.println("Nhap dien tich");
					double dienTich = sc.nextDouble();
					sc.nextLine();
					System.out.println("Nhap so bong den");
					int soBongDen = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhap chuyen nganh");
					String chuyenNganh = sc.nextLine();
					System.out.println("Nhap suc chua");
					int sucChua = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhap so bon chua");
					int bonChua = sc.nextInt();
					temp = new PhongThiNghiem(maPhong, dayPhong, dienTich, soBongDen, chuyenNganh, sucChua, bonChua);
					dsp.themPhong(temp);
				}
				else {
					System.out.println("Khong dung loai phong");
				}
				
				
			}
			case 2 -> {
				sc.nextLine();
				System.out.println("Nhap ma phong can tim");
				String maPhong = sc.nextLine();
				System.out.println("Ket qua tim kiem: "+dsp.timKiem(maPhong));
		
			}
			case 3 ->{
				for (Phong p : dsp.getDanhSach()) {
					System.out.println(p);
				}
			}
			case 4 ->{
				for(Phong p : dsp.danhSachPhongDatChuan()) {
					System.out.println(p);
				}
			}
			case 5 ->{
				for( Phong p : dsp.sapXepTangDanDayNha()) {
					System.out.println(p);
					
				}
			}
			case 6 ->{
				for (Phong p: dsp.sapXepGiamDanDienTich()) {
					System.out.println(p);
					
				}
				
			}
			case 7 ->{
				for (Phong p : dsp.sapxepTangDanSoBongDen()) {
					System.out.println(p);
					
				}
			}
			case 8 ->{
				sc.nextLine();
				System.out.println("Nhap ma phong can update");
				String maPhong = sc.nextLine();
				dsp.capNhat(maPhong);
			}
			case 9 ->{
				sc.nextLine();
				System.out.println("Nhap ma phong can xoa");
				String maPhong = sc.nextLine();
				dsp.xoaPhong(maPhong);
			}
			case 10 ->{
				System.out.println("Tong so phong hoc la: "+dsp.getTongSoPhongHoc());
				
			}
			case 11 ->{
				System.out.println("Danh sach phong hoc co 60 may la:");
				for (Phong p : dsp.dsPhongCo60May()) {
					System.out.println(p);
				}
			}
			}
		}while(chon!=0);
	}
	
	private static void khoitaods(DanhSachPhong dsp) {
		dsp.themPhong(new PhongLyThuyet("P001", "Phuong Vi", 250000.0, 70, 25));
		dsp.themPhong(new PhongMayTinh("P002", "Rang Dong", 500000.0, 100, 75));
		dsp.themPhong(new PhongThiNghiem("P003", "Chien Thang", 300000.0, 80,"Hoi suc",150,5));
		
	}
}

