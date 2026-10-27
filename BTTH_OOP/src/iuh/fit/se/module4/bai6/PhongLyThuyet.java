package iuh.fit.se.module4.bai6;

public class PhongLyThuyet extends Phong {
	private int soMayChieu;

	public PhongLyThuyet() {
		super();
		this.soMayChieu = 0;
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		if(soMayChieu<=0)
			throw new RuntimeException("Phai co may chieu");
		this.soMayChieu = soMayChieu;
	}

	public int getSoMayChieu() {
		return soMayChieu;
	}

	public void setSoMayChieu(int soMayChieu) {
		this.soMayChieu = soMayChieu;
	}
	
	public boolean checkDatChuan() {
		if(dienTich/10 >= soBongDen) return true;
		return false;
	}
	
}

