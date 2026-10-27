package iuh.fit.se.module4.bai6;

public abstract class Phong {
	protected String maPhong;
	protected String dayNha;
	protected double dienTich;
	protected int soBongDen;
	public Phong() {
		this("","",0.0,0);
	}
	public Phong(String maPhong, String dayNha, double dienTich, int soBongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	
	public abstract boolean checkDatChuan();
	@Override
	public String toString() {
		return String.format("%-20s %-10s %5.2f %10d", maPhong, dayNha, dienTich, soBongDen);
	}
	
	
	
	
}

