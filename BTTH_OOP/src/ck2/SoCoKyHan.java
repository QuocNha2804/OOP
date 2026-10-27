package ck2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SoCoKyHan extends SoTK {
	private int kyHan;

	public SoCoKyHan() {
		super();
		this.kyHan = 0;
	}

	public SoCoKyHan(String maSo, String cMND, String hoTen, double soTienGui, LocalDate ngayLapSo, double laiSuat,
			int kyHan) {
		super(maSo, cMND, hoTen, soTienGui, ngayLapSo, laiSuat);
		if(kyHan <0)
			throw new RuntimeException("So >=0");
		this.kyHan = kyHan;
	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	@Override
	public double tienLai() {
		double thangGui = ngayLapSo.until(LocalDate.now()).toTotalMonths();
		if(thangGui >=6)
			return soTienGui*laiSuat*thangGui;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %5d", maSo, cMND, hoTen, df.format(soTienGui), ngayLapSo.format(dt), df.format(laiSuat), df.format(tienLai()), kyHan);
	}
	
	
	
}
