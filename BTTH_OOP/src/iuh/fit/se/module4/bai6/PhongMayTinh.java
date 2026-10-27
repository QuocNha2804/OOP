package iuh.fit.se.module4.bai6;

public class PhongMayTinh extends Phong {
	private int soMayTinh;

	public PhongMayTinh() {
		super();
		this.soMayTinh = 0;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		if(this.dienTich/1.5 < soMayTinh)
			throw new RuntimeException("Trung binh 1.5m dat mot may");
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	
	public boolean checkDatChuan() {
		if(dienTich/10 >= soBongDen) return true;
		return false;
	}
	
	
	
	
}

