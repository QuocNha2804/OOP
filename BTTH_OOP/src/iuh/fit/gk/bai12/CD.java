package iuh.fit.gk.bai12;

import java.text.DecimalFormat;

public class CD {
	private final int maCD;
	private String tuaCD;
	private int soBaiHat;
	private LoaiCD loaiCD;
	private double giaThanh;
	public CD() {
		this(999999,"chua xac dinh",0,LoaiCD.MOI,0.0);
	}
	public CD(int maCD, String tuaCD, int soBaiHat, LoaiCD loaiCD, double giaThanh) {
		if(maCD <= 0)
			throw new RuntimeException("Ma CD >0");
		else 
			this.maCD = maCD;
		
		if(tuaCD == null || tuaCD.trim().isEmpty())
			throw new RuntimeException("Tua CD khong duoc rong");
		else 
			this.tuaCD = tuaCD;;
			
		if(soBaiHat <=0)
			throw new RuntimeException("So bai hat > 0");
		else 
			this.soBaiHat = soBaiHat;
		
		this.loaiCD = loaiCD;
		
		if(giaThanh <=0)
			throw new RuntimeException("Gia thanh >0");
		else 
			this.giaThanh = giaThanh;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public LoaiCD getLoaiCD() {
		return loaiCD;
	}
	public void setLoaiCD(LoaiCD loaiCD) {
		this.loaiCD = loaiCD;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	public int getMaCD() {
		return maCD;
	}
	@Override
	public String toString() {
		return String.format("%-10d %-20s %-10d %-20s %f", maCD, tuaCD, soBaiHat, loaiCD, giaThanh);
	}
//	@Override
//	public String toString() {
//		DecimalFormat df = new DecimalFormat("#,##0.#");
//		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", loaiCD=" + loaiCD + ", giaThanh="
//				+ df.format(giaThanh) + "]";
//	}
	
	
}
