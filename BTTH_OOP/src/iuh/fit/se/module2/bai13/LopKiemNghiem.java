package iuh.fit.se.module2.bai13;

import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachCongNhan dsCN = new DanhSachCongNhan(6);
		khoitaomang(dsCN);
		int chon = 0;
		do {
			System.out.println("Nhap menu\n"
					+"1: Them CN\n"
					+"2: In Mang\n"
					+"3: In so phan tu\n"
					+"4: CN lam tren 200 SP\n"
					+"5: Sap xep CN so SP giam dan\n");
			chon = sc.nextInt();
			switch(chon) {
			case 1 ->{
				CongNhan CN = new CongNhan();
				sc.nextLine();
				System.out.println("Nhap ho");
				CN.setmHo(sc.nextLine());
				sc.nextLine();
				System.out.println("Nhap ten");
				CN.setmTen(sc.nextLine());
				System.out.println("Nhap so sp");
				CN.setmSoSP(sc.nextInt());
				sc.nextLine();
				dsCN.themCN(CN);
			}
			case 2->{
				CongNhan[] temp = dsCN.getDSCN();
				for( CongNhan cn: temp) {
					System.out.println(cn);
				}
			}
			case 3->{
				System.out.println("So phan tu cua mang la: "+ dsCN.getSoLuongCN());
			}
			case 4->{
				System.out.println("Cong nhan co SP tren 200");
				dsCN.timCN200SP();
			}
			case 5->{
				CongNhan[] temp = dsCN.sapxep();
				for(CongNhan cn : temp) {
					System.out.println(cn);
				}
			}
			}
		}while(chon >0);
		
	}
	private static void khoitaomang(DanhSachCongNhan dsCN) {
		dsCN.themCN(new CongNhan("Tran", "Quoc Nha", 250));
		dsCN.themCN(new CongNhan("Do", "Minh Quan", 150));
		dsCN.themCN(new CongNhan("Nguyen", "Van Nam", 350));
		dsCN.themCN(new CongNhan("Bui", "Quoc Thong", 99));
		dsCN.themCN(new CongNhan("Dang", "Thanh Xuan", 610));
	}
}
