package iuh.fit.se.gk;
import java.time.LocalDate;
public class Thuoc {
	private String maSo;
	private String tenThuoc;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String nuocSanXuat;
	private double donGia;
	private String tenDanhMuc;
	
	public Thuoc() {
		this("","",LocalDate.now(),LocalDate.now(),"",0.0,"");
	}
	public Thuoc( String maSo, String tenThuoc, LocalDate ngaySanXuat, LocalDate ngayHetHan,String nuocSanXuat, double donGia, String tenDanhMuc) {
		this.maSo = maSo;
		this.tenThuoc = tenThuoc;
		if(ngaySanXuat.isAfter(LocalDate.now())) {
			throw new RuntimeException("Ngay san xuat phai truoc ngay hien tai");
		}
		else {
			this.ngaySanXuat = ngaySanXuat;
		}
		this.ngayHetHan = ngayHetHan;
		this.nuocSanXuat = nuocSanXuat;
		if(donGia < 0) {
			throw new RuntimeException("Don gia thuoc phai >=0");
		}
		else {
			this.donGia = donGia;
		}
		this.tenDanhMuc = tenDanhMuc;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getTenThuoc() {
		return tenThuoc;
	}
	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public String getNuocSanXuat() {
		return nuocSanXuat;
	}
	public void setNuocSanXuat(String nuocSanXuat) {
		this.nuocSanXuat = nuocSanXuat;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	
	@Override
	public String toString() {
		return String.format("%-20s %-20s %-20s %-20s %-20s %5.2f %-20s",maSo,tenThuoc,ngaySanXuat,ngayHetHan,nuocSanXuat,donGia,tenDanhMuc);
	}


}
