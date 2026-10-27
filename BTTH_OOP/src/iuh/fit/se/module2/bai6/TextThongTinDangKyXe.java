package iuh.fit.se.module2.bai6;

public class TextThongTinDangKyXe {
	public static void main(String[] args) {
		ThongTinDangKyXe p1 = new ThongTinDangKyXe("Quoc Nha","SH",15000000,150);
		ThongTinDangKyXe p2 = new ThongTinDangKyXe("Quoc Thong","Airblade",10000000,90);
		ThongTinDangKyXe p3 = new ThongTinDangKyXe("Xuan Loc","Vision",20000000,210);
		System.out.printf("%-20s %-20s %5s %20s %10s","Tên chủ xe","Loại xe","Giá xe","Dung tích","Thuế");
		System.out.printf("\n===============================================================================\n");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
