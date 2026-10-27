package iuh.fit.se.module2.bai12;

import java.util.Scanner;

public class LopKiemNghiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachCD dsCD = new DanhSachCD(4);
		khoiTaoDuLieu(dsCD);
		int chon =0;
		do {
			System.out.println("Moi chon menu: \n"
					+"1: Them cd\n"
					+"2: In danh sach\n"
					+"3: Xoa cd\n"
					+"4: So luong CD\n"
					+"5: Tong gia thanh\n"
					+"6: Tim ma CD\n"
					+"7: Sap xep gia thanh\n"
					+"8: Sap xep tua CD");
			chon = sc.nextInt();
			switch(chon) {
			case 1->{
				CD cd = new CD();
				System.out.println("Nhap ma CD: ");
				cd.setMaCD(sc.nextInt());
				sc.nextLine();
				System.out.println("Nhap tua CD");
				cd.setTuaCD(sc.nextLine());
				System.out.println("Nhap so luong");
				cd.setSoBaiHat(sc.nextInt());
				System.out.println("Nhap gia thanh");
				cd.setGiaThanh(sc.nextDouble());
				dsCD.themCD(cd);
			
				}
			case 2->{
				CD [] temp = dsCD.getDSCD();
				for( CD cd: temp) {
					System.out.println(cd);
					}
				}
			case 3 ->{
				System.out.println("Nhap ma cd muon xoa");
				int maCD = sc.nextInt();
				dsCD.xoaCD(maCD);
			}
			case 4->{
				System.out.println("So luong CD trong danh sach la: "+dsCD.getCount());
				
			}
			case 5->{
				System.out.println("Tong gia thanh cac CD: "+dsCD.tongGiaThanh());
			}
			case 6->{
				System.out.println("Nhap ma can tim");
				int maCD = sc.nextInt();
				dsCD.timCD(maCD);
			}
			case 7 -> {
				CD[] temp = dsCD.sapxepGiaThanh();
				for(CD cd: temp)
					System.out.println(cd);
			}
			case 8->{
				CD[] temp = dsCD.sapxepTuaCD();
				for( CD cd : temp)
					System.out.println(cd);
			}
			}
		}while ( chon >0);
		
	}
	
	
	
	private static void khoiTaoDuLieu(DanhSachCD dsCD) {
		dsCD.themCD(new CD(1001,"Mua Xuan Den",10, 15000.0));
		dsCD.themCD(new CD(1002,"Mua Ha Den",10, 20000.0));
		dsCD.themCD(new CD(1003,"Mua Thu Den",10, 18000.0));
		dsCD.themCD(new CD(1004,"Mua Dong Den",10, 19000.0));
		
	}


}
