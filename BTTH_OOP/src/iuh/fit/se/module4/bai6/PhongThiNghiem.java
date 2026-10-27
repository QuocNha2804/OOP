package iuh.fit.se.module4.bai6;

public class PhongThiNghiem extends Phong{
	private String chuyenNganh;
	private int sucChua;
	private int bonRua;
	public PhongThiNghiem() {
		super();
		this.chuyenNganh = "";
		this.sucChua =0;
		this.bonRua=0;
	}
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh,
			int sucChua, int bonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		if(bonRua<=0)
			throw new RuntimeException("Phai co bon rua");
		this.bonRua = bonRua;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public int getBonRua() {
		return bonRua;
	}
	public void setBonRua(int bonRua) {
		this.bonRua = bonRua;
	}
	
	public boolean checkDatChuan() {
		if(dienTich/10 >= soBongDen) return true;
		return false;
	}
	
	
}

