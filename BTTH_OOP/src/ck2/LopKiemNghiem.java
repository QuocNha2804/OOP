package ck2;

import java.time.LocalDate;
import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		DanhSachSoTK dss = new DanhSachSoTK();
		khoiTaoDS(dss);
		Scanner sc = new Scanner(System.in);
		System.out.println("Danh Sach So");
		dss.getDSS();
		System.out.println("Nhap CMND can dem so: ");
		String cMND = sc.nextLine();
		System.out.println("So luong so theo CMND la: "+ dss.demSoTheoCMND(cMND));
		System.out.println("Danh sach so co ky han co so tien gui lon nhat: ");
		for (SoTK s : dss.getDSSoCoKyHanTienMax()) {
			System.out.println(s);
		}
		System.out.println("Nhap thang x");
		int x = sc.nextInt();
		System.out.println("Nhap nam y");
		int y = sc.nextInt();
		System.out.println("Danh sach so mo trong thang x nam y: ");
		for (SoTK s : dss.getDSSoMoTrongThangNam(x, y)) {
			System.out.println(s);
		}
		System.out.println("Danh sach cac so giam dan theo ngay lap so:");
		for (SoTK s : dss.sapXepSoTheoNgayLapSo()) {
			System.out.println(s);
		}
		sc.close();
	}
	public static void khoiTaoDS(DanhSachSoTK dss) {
		dss.themSo(new SoKhongKyHan("S001", "123783956", "Tran Quoc Nha", 20000000.0, LocalDate.of(2022, 12, 22), 3.5));
		dss.themSo(new SoKhongKyHan("S002", "223783956", "Dang Thanh Xuan", 15000000.0, LocalDate.of(2020, 6, 17), 2.5));
		dss.themSo(new SoCoKyHan("S003", "873947268", "Nguyen Khanh Dang", 22000000.0, LocalDate.of(2024, 4, 28), 2.5, 5));
		dss.themSo(new SoCoKyHan("S004", "927465846", "Bui Quoc Thong", 25000000.0, LocalDate.of(2022, 8, 9), 6.5, 4));
		dss.themSo(new SoCoKyHan("S005", "274659273", "Bui Thanh Liem", 35000000.0, LocalDate.of(2024, 4, 20), 5.5, 7));
	}
	
}
