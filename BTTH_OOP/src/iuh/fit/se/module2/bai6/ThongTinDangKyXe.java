package iuh.fit.se.module2.bai6;

public class ThongTinDangKyXe {
	private String tenChuXe;
	private String loaiXe;
	private long triGiaXe;
	private long dungTichXilanh;
	public ThongTinDangKyXe() {
		this("","",0,0);
	}
	public ThongTinDangKyXe(String ten, String loai, long gia, long xilanh) {
		this.tenChuXe = ten;
		this.loaiXe = loai;
		this.setTriGiaXe(gia);
		this.setDungTichXilanh(xilanh);
		
	}
	public String getTenChuXe() {
		return tenChuXe;
	}
	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public long getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(long triGiaXe) {
		if(triGiaXe <0)
			throw new IllegalArgumentException("Lỗi");
		this.triGiaXe = triGiaXe;
	}
	public long getDungTichXilanh() {
		return dungTichXilanh;
	}
	public void setDungTichXilanh(long dungTichXilanh) {
		if(dungTichXilanh <0)
			throw new IllegalArgumentException("Lỗi");
		this.dungTichXilanh = dungTichXilanh;
	}
	
	public double getTax() {
		if(this.dungTichXilanh<100)
			return (double)0.01*this.triGiaXe;
		else if(this.dungTichXilanh>=100 && this.dungTichXilanh<=200)
			return (double)0.03*this.triGiaXe;
		else 
			return (double)0.05*this.triGiaXe;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s %-20s %5d %15d %15.2f",tenChuXe,loaiXe,triGiaXe,dungTichXilanh,getTax());
	}
	
}
