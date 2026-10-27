package iuh.fit.se.gk;
import java.time.LocalDate;
import java.util.Scanner;
public class LopKiemNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachThuoc dsThuoc = new DanhSachThuoc(4);
		khoitaods(dsThuoc);
		int chon =0;
		do {
			System.out.println("Nhap menu(Nhap 0 de thoat)\n"
					+"1: Them Thuoc\n"
					+"2: Xoa thuoc het han khi biet ma thuoc\n"
					+"3: In danh sach thuoc\n");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 1 ->{
				Thuoc x = new Thuoc();
				System.out.println("Nhap ma thuoc");
				x.setMaSo(sc.nextLine());
				System.out.println("Nhap ten thuoc");
				x.setTenThuoc(sc.nextLine());
				System.out.println("Nhap nam, thang, ngay san xuat");
				x.setNgaySanXuat(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
				System.out.println("Nhap nam, thang, ngay het han");
				x.setNgayHetHan(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
				sc.nextLine();
				System.out.println("Nhap ten nuoc san xuat");
				x.setNuocSanXuat(sc.nextLine());
				System.out.println("Nhap don gia");
				x.setDonGia(sc.nextDouble());
				sc.nextLine();
				System.out.println("Nhap ten danh muc");
				x.setTenDanhMuc(sc.nextLine());
				dsThuoc.themThuoc(x);
			}
			case 2->{
				String ma;
				System.out.println("Nhap ma can xoa");
				ma = sc.nextLine();
				//sc.nextLine()
;				dsThuoc.xoaThuoc(ma);
				Thuoc[] temp = dsThuoc.getDSThuoc();
				for(Thuoc t: temp) {
					System.out.println(t);
				}
				}
			
			case 3 ->{
				Thuoc[] temp = dsThuoc.getDSThuoc();
				for( Thuoc t : temp) {
					System.out.println(t);
				}
			}
			}
		}while(chon!=0);
		
	}
	
	
	
	
	private static void khoitaods(DanhSachThuoc dsThuoc) {
		dsThuoc.themThuoc(new Thuoc("01","Thuoc Giam Dau",LocalDate.of(2019, 2, 28), LocalDate.of(2024, 12, 17), "Viet Nam",25000.0,"Thuoc Tu Thien"));
		dsThuoc.themThuoc(new Thuoc("02","Thuoc Ho",LocalDate.of(2021, 12, 20), LocalDate.of(2024, 12, 17), "Viet Nam",20000.0,"Thuoc Tu Thien"));
		dsThuoc.themThuoc(new Thuoc("03","Thuoc Sot",LocalDate.of(2022, 4, 28), LocalDate.of(2024, 5, 27), "Viet Nam",17000.0,"Thuoc Tu Thien"));
		dsThuoc.themThuoc(new Thuoc("04","Thuoc Tieu Chay",LocalDate.of(2020, 8, 19), LocalDate.of(2024, 11, 17), "Viet Nam",35000.0,"Thuoc Tu Thien"));
	}

}
