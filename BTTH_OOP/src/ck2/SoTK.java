package ck2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class SoTK {
	protected String maSo;
	protected String cMND;
	protected String hoTen;
	protected double soTienGui;
	protected LocalDate ngayLapSo;
	protected double laiSuat;
	public SoTK() {
		this("","","",0.0,LocalDate.now(),0.0);
	}
	public SoTK(String maSo, String cMND, String hoTen, double soTienGui, LocalDate ngayLapSo, double laiSuat) {
		if(maSo ==null)
			throw new RuntimeException("Chuoi khong duoc rong");
		this.maSo = maSo;
		
		if(cMND == null|| cMND.trim().length()!=9)
			throw new RuntimeException("cMND khong duoc rong va 9 so");
		else {
//			if(!cMND.startsWith("S"))
//				throw new RuntimeException("Ki tu dau la S");
			for(int i =1;i<9;i++) {
				if(!Character.isDigit(cMND.charAt(i)))
					throw new RuntimeException("Phai la ki tu so");
			}
		}
		this.cMND = cMND;
		
		if(hoTen==null)
			throw new RuntimeException("Chuoi khong duoc rong");
		this.hoTen = hoTen;
	
		if(soTienGui <0)
			throw new RuntimeException("Tien >=0");
		this.soTienGui = soTienGui;
		
		if(ngayLapSo.isAfter(LocalDate.now()))
			throw new RuntimeException("Ngay phai truoc hoac bang hien tai");
		this.ngayLapSo = ngayLapSo;
		
		if(laiSuat <0) 
			throw new RuntimeException("Tien >=0");
		this.laiSuat = laiSuat;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getcMND() {
		return cMND;
	}
	public void setcMND(String cMND) {
		this.cMND = cMND;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getSoTienGui() {
		return soTienGui;
	}
	public void setSoTienGui(double soTienGui) {
		this.soTienGui = soTienGui;
	}
	public LocalDate getNgayLapSo() {
		return ngayLapSo;
	}
	public void setNgayLapSo(LocalDate ngayLapSo) {
		this.ngayLapSo = ngayLapSo;
	}
	public double getLaiSuat() {
		return laiSuat;
	}
	public void setLaiSuat(double laiSuat) {
		this.laiSuat = laiSuat;
	}
	
	public abstract double tienLai();
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", maSo, cMND, hoTen, df.format(soTienGui), ngayLapSo.format(dt), df.format(laiSuat), df.format(tienLai()));
	}
	
	
	
}
