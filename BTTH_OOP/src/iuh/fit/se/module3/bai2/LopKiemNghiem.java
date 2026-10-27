package iuh.fit.se.module3.bai2;

import java.time.LocalDate;

public class LopKiemNghiem {
	public static void main(String[] args) {
		Sach s1 = new SachGiaoKhoa(101, LocalDate.of(2005,7, 15), 17000.0,10, "Quoc Nha", TinhTrang.MOI );
		Sach s2 = new SachGiaoKhoa(102, LocalDate.of(2004,4, 28), 19000.0,10, "Minh Quan", TinhTrang.MOI );
		Sach s3 = new SachThamKhao(103, LocalDate.of(2009,5, 19), 20000.0,10, "Kim Dong", 0.5 );
		Sach s4 = new SachThamKhao(104, LocalDate.of(2010,6, 25), 25000.0,10, "Xuan Loc", 0.4 );
		
		DanhSachSach dsSach = new DanhSachSach(4);
		dsSach.themSach(s1);
		dsSach.themSach(s2);
		dsSach.themSach(s3);
		dsSach.themSach(s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("Topng tien SGK: "+ dsSach.tongtienSachGiaoKhoa());
		System.out.println("Tong tien STK: "+ dsSach.tongtienSachThamKhao());
		System.out.println("Tim sach giao khoa tac gia la Quoc Nha: ");
		System.out.println(dsSach.timSachGiaoKhoa("Quoc Nha"));
		System.out.println("Tim gia thanh cao nhat: "+ dsSach.timThanhTienMax());
	}
}
