package iuh.fit.se.module3.bai1;

public class Xe {
	private int maChuyen;
	private String hoTen;
	private int soXe;
	private double doanhThu;
	public Xe() {
		this(0,"",0,0.0);
	}
	public Xe(int maChuyen, String hoTen, int soXe,double doanhThu) {
		this.maChuyen= maChuyen;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
		
	}
	
	public int getMaChuyen() {
		return maChuyen;
	}
	public void setMaChuyen(int maChuyen) {
		this.maChuyen = maChuyen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	@Override
	public String toString() {
		return String.format("%-5d %-20s %-5d %5.2f",maChuyen,hoTen,soXe,doanhThu);
	}
}
