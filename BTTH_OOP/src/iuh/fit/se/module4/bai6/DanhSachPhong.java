package iuh.fit.se.module4.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachPhong {
	private List<Phong> dsp = new ArrayList<Phong>();

	public DanhSachPhong() {
		this.dsp = new ArrayList<Phong>();
	}

	public DanhSachPhong(List<Phong> dsp) {
		this.dsp = dsp;
	}
	
	//them phong
	public boolean themPhong(Phong x) {
		for (Phong p : dsp) {
			if(p.maPhong.equalsIgnoreCase(x.maPhong))
				return false;
		}
		dsp.add(x);
		return true;
	}
	
	// tim kiem khi biet ma phong
	public boolean timKiem(String maPhong) {
		for (Phong p : dsp) {
			if(p.maPhong.equalsIgnoreCase(maPhong)) return true;
		}
		return false;
	}
	
	//lay toan bo danh sach phong hoc
	public List<Phong> getDanhSach(){
		return dsp;
	}
	
	//lay danh sach cac phong hoc dat chuan
	public List<Phong> danhSachPhongDatChuan(){
		List<Phong> temp = new ArrayList<Phong>();
		for (Phong p : dsp) {
			if(p.checkDatChuan()==true)
				temp.add(p);
		}
		return temp;
	}
	
	//sap xep danh sach tang dan theo day nha
	public List<Phong> sapXepTangDanDayNha() {
		List<Phong> temp = dsp.stream()
				.sorted((o1,o2) -> o1.dayNha.compareToIgnoreCase(o2.dayNha))
				.toList();
		return temp;
		
	}
	
	//sap xep danh sach giam dan theo dien tich
	public List<Phong> sapXepGiamDanDienTich(){
		List<Phong> temp = dsp.stream()
				.sorted((o1,o2) -> Double.compare(o2.dienTich, o1.dienTich))
				.toList();
		return temp;
	} 
	
	//sap xep tang dan so bong den
	public List<Phong> sapxepTangDanSoBongDen(){
		List<Phong> temp = dsp.stream()
				.sorted((o1,o2) -> Integer.compare(o1.soBongDen, o2.soBongDen))
				.toList();
		return temp;
	}
	
	//cap nhat phong may khi biet ma phong
	public boolean capNhat(String maPhong) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so may tinh muon update");
		int soMay = sc.nextInt();
		for (Phong p : dsp) {
			if(p.maPhong.equalsIgnoreCase(maPhong)) {
				if(p instanceof PhongMayTinh) {
					
					((PhongMayTinh) p).setSoMayTinh(soMay);
					return true;
				}
			}
		}
		return false;
	}
	
	//xoa phong hoc khi biet ma phong
	public boolean xoaPhong(String maPhong) {
		for (Phong p : dsp) {
			if(p.maPhong.equalsIgnoreCase(maPhong))
				dsp.remove(p);
				return true;
		}
		return false;
	}
	
	//tong so phong hoc
	public int getTongSoPhongHoc() {
		return dsp.size();
	}
	
	//lay danh sach phong co 60 may
	public List<Phong> dsPhongCo60May(){
		List<Phong> temp = new ArrayList<Phong>();
		for (Phong p : dsp) {
			if(p instanceof PhongMayTinh) {
				if(((PhongMayTinh) p).getSoMayTinh()>=60) {
					temp.add(p);
				}
			}
		}
		return temp;
	}
	
}

