package iuh.fit.se.module3.bai1;

public class KiemNghiem {
	public static void main(String[] args) {
		XeNoiThanh xe1 = new XeNoiThanh(1001,"Quoc Nha",111,25000.0,5,6.0);
		XeNoiThanh xe2 = new XeNoiThanh(1002,"Quoc Thong",222,30000.0,9,8.0);
		
		XeNgoaiThanh xe3 = new XeNgoaiThanh(1003,"Xuan Loc",333,75000.0,"Nha",20);
		XeNgoaiThanh xe4 = new XeNgoaiThanh(1004,"Minh Quan",444,15000.0,"Truong",10);
		System.out.println("Doanh thu xe 1 la: "+ xe1.getDoanhThu());
		System.out.println("Doanh thu xe 2 la: "+ xe2.getDoanhThu());
		System.out.println("Doanh thu xe 3 la: "+ xe3.getDoanhThu());
		System.out.println("Doanh thu xe 4 la: "+ xe4.getDoanhThu());
		
		System.out.println("Tong doanh thu xe noi thanh: "+ (xe1.getDoanhThu()+xe2.getDoanhThu()));
		System.out.println("Tong doanh thu xe ngoai thanh: "+ (xe3.getDoanhThu()+xe4.getDoanhThu()));
		
	}
}
