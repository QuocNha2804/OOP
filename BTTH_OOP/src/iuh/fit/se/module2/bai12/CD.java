package iuh.fit.se.module2.bai12;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	public CD() {
		this(999999,"Chua xac dinh",0,00.0);
	}
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		if(maCD > 0)
			this.maCD = maCD;
		else 
			this.maCD = 999999;
		
		if(tuaCD == null || tuaCD.trim().isEmpty()== true)
			this.tuaCD = "Khong xac dinh";
		else
			this.tuaCD = tuaCD;
		
		if(soBaiHat > 0)
			this.soBaiHat = soBaiHat;
		
		if(giaThanh > 0)
			this.giaThanh = giaThanh;
	}
	
	
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		this.maCD = maCD;
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
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	@Override
	public String toString() {
		return String.format("%-5d %-10s %-5d %5.2f",maCD,tuaCD,soBaiHat,giaThanh);
	}
}
