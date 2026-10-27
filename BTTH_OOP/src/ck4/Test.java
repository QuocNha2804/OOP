package ck4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		SoftwareHouse list = new SoftwareHouse("DG Houes");
		khoiTaoDS(list);
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
			System.out.println("Nhap menu (Nhap 0 de thoat)\n"
					+ "1: Them nhan vien\n"
					+ "2: In danh sach\n"
					+ "3: Tinh tong tien\n"
					+ "4: Sap xep nhan vien theo ten\n"
					+ "5: Tra ve danh sach lap trinh vien\n"
					+ "6: Cap nhat phong ban\n"
					+ "7: Xoa nhan vien\n");
			chon = sc.nextInt();
			switch(chon) {
			case 1 ->{
				System.out.println("Nhap ma nhan vien");
				int maNV = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap ten nhan vien");
				String hoTen = sc.nextLine();
				System.out.println("Nhap luong co ban");
				double luongCoBan = sc.nextDouble();
				sc.nextLine();
				System.out.println("Nhap loai nhan vien");
				String loaiNV = sc.nextLine();
				if(loaiNV.equals("Programmer") || loaiNV.equals("ProjectLeader")) {
					System.out.println("Nhap ngon ngu");
					String ngongNgu = sc.nextLine();
					if(loaiNV.equals("Programmer"))
						System.out.println("Ket qua them la: "+list.addEmployee(new Programmer(maNV, hoTen, luongCoBan, ngongNgu)));
					else
						System.out.println("Ket qua them la: "+list.addEmployee(new ProjectLeader(maNV, hoTen, luongCoBan, ngongNgu)));
				}
				else if(loaiNV.equals("Administrator")) {
					System.out.println("Nhap phong ban");
					String phongBan = sc.nextLine();
					System.out.println("Ket qua them la: "+list.addEmployee(new Administrator(maNV, hoTen, luongCoBan, phongBan)));
				}
				else
					System.out.println("Loai nhan vien khong hop le");
			}
			case 2 ->{
				for (Employeee e : list.displayAllStaff()) {
					System.out.println(e);
				}
			}
			case 3 ->{
				System.out.println("Tong tien la: "+ list.getMonthSalaryBill());
			}
			case 4 ->{
				System.out.println("Danh sach nhan vien sap xep theo ten");
				for (Employeee e : list.sortAllStaff()) {
					System.out.println(e);
				}
			}
			case 5 ->{
				System.out.println("Danh sach lap trinh vien");
				for (Employeee e : list.displayListProgrammers()) {
					System.out.println(e);
				}
			}
			case 6 ->{
				System.out.println("Nhap ma nhan vien can cap nhat");
				int maNVUpdate = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap ten phong ban can cap nhat");
				String tenPhongBanUpdate = sc.nextLine();
				System.out.println("Ket qua cap nhat la: "+ list.updateDepartmentForAdmin(maNVUpdate, tenPhongBanUpdate));
			}
			case 7 ->{
				System.out.println("Nhap ma nhan vien muon xoa");
				int maNVDelete = sc.nextInt();
				System.out.println("Ket qua xoa nhan vien: "+ list.deleteEmployeee(maNVDelete));
			}
			}
		}while(chon!=0);
		
		sc.close();
	}
	public static void khoiTaoDS(SoftwareHouse list) {
		list.addEmployee(new Programmer(1001, "Quoc Nha", 1400000.0, "Java"));
		list.addEmployee(new Programmer(1002, "Xuan Loc", 1500000.0, "Python"));
		list.addEmployee(new ProjectLeader(1003, "Thanh Xuan", 1700000.0, "Java"));
		list.addEmployee(new ProjectLeader(1004, "Hoai Nho", 1700000.0, "Python"));
		list.addEmployee(new Administrator(1005, "Mong Tuyen", 1200000.0, "Ke Toan"));
		list.addEmployee(new Administrator(1006, "Minh Quan", 1300000.0, "Hanh Chinh"));
	}
}
