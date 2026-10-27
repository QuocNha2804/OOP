package iuh.fit.gk.bai12;

import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		CDList dscd = new CDList(4);
		khoitaods(dscd);
		int chon;
		do {
			System.out.println("Nhap lua chon(Nhap 0 de thoat)\n"
					+"1. Them CD\n"
					+"2. In CD\n"
					+"3. Lay so luong theo loai CD\n"
					+"4. Xoa CD theo maCD\n"
					+"5. Tong gia thanh\n"
					+"6. Tim kiem theo ma CD\n"
					+"7. Sua thong tin\n"
					+"8. Danh sach gia thanh max\n"
					+"9. Sap xep gia thanh giam\n"
					+"10. Sap xep tua CD tang\n");
			chon = sc.nextInt();
			switch(chon) {
			case 1->{
				System.out.println("Nhap maCD");
				int maCD = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap tua CD");
				String tuaCD = sc.nextLine();
				System.out.println("Nhap so bai hat");
				int soBaiHat = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap loai CD");
				String loaiCDnhap = sc.nextLine();
				LoaiCD loaiCD = LoaiCD.valueOf(loaiCDnhap.toUpperCase());
				System.out.println("Nhap gia thanh");
				double giaThanh= sc.nextDouble();
				CD x = new CD(maCD, tuaCD, soBaiHat, loaiCD, giaThanh);
				dscd.themCD(x);
			}
			case 2->{
				for(CD cd : dscd.getDSCD()) {
					System.out.println(cd);
				}
			
			}
			case 3->{
				sc.nextLine();
				System.out.println("Nhap loai CD");
				String loaiCDnhap = sc.nextLine();
				LoaiCD loaiCD = LoaiCD.valueOf(loaiCDnhap.toUpperCase());
				System.out.println("So luong CD theo loai la " + dscd.getSoLuongCD(loaiCD));
			}
			case 4->{
				System.out.println("Nhap ma CD can xoa");
				int maCD = sc.nextInt();
				dscd.xoaCD(maCD);
			}
			case 5->{
				System.out.println("Tong gia thanh CD la "+ dscd.getTongGiaThanh());
			}
			case 6->{
				System.out.println("Nhap ma CD can tim");
				int maCD = sc.nextInt();
				System.out.println(dscd.timKiem(maCD));
				
			}
			case 7->{
				System.out.println("Nhap ma CD can sua");
				int maCD = sc.nextInt();
				dscd.suaThongTin(maCD);
				
						
			}
			case 8->{
				System.out.println("Danh sach CD co gia thanh max");
				for( CD cd : dscd.giaThanhMax()) {
					System.out.println(cd);
				}
			}
			case 9->{
				System.out.println("Danh sach CD sap xep theo gia thanh giam dan");
				for(CD cd: dscd.sapXepGiaThanhGiam()) {
					System.out.println(cd);
				}
			}
			case 10->{
				System.out.println("Danh sach CD sap xep theo tua CD tang dan");
				for(CD cd : dscd.sepXepTuaCDTang()) {
					System.out.println(cd);
				}
			}
			}
		}while(chon!=0);
		
		
		
		
	}
	private static void khoitaods(CDList dscd) {
		dscd.themCD(new CD(1001,"2AM",2,LoaiCD.MOI, 27000.0));
		dscd.themCD(new CD(1002,"Mot Ngay Khac",3,LoaiCD.CU, 30000.0));
		dscd.themCD(new CD(1003,"Ban Doi",4,LoaiCD.MOI, 30000.0));
		dscd.themCD(new CD(1004,"Vang Thai Duong",6,LoaiCD.CU, 15000.0));
	}
}
