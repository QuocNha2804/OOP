package iuh.fit.se.module2.bai4;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT,diemTH;
	public DiemSinhVien() {
		this(0,"",0.0,0.0);
	}
	public DiemSinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		this.setMaSV(maSV);
		this.setHoTen(hoTen);
		this.setDiemLT(diemLT);
		this.setDiemTH(diemTH);
		
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if(maSV >0)
			this.maSV= maSV;
		else
			System.out.println("Ma sinh vien phai lon hon 0");
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(hoTen != null && hoTen.trim().isEmpty()==false)
			this.hoTen = hoTen;
		else
			System.out.println("Ho ten khong duoc rong");
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		if(diemLT >=0.0 && diemLT <=10.0)
			this.diemLT=diemLT;
		else
			System.out.println("Diem ly thuyet phai lon hon bang 0 va nho hon bang 10");
		
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		if(diemTH>=0.0 && diemTH <=10.0)
			this.diemTH = diemTH;
		else
			System.out.println("Diem thuc hanh phai lon hon bang 0 va nho hon bang 10");
	}
	public double diemTrungBinh() {
		return (double)(this.diemLT+this.diemTH)/2;
	}
	@Override
	public String toString() {
		return String.format("%-10d %-10s%10.2f %10.2f %10.2f",maSV,hoTen,diemLT,diemTH, diemTrungBinh());
	}
	
	
}
