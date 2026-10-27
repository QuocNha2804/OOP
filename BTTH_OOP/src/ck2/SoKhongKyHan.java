package ck2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SoKhongKyHan extends SoTK{

	public SoKhongKyHan() {
		super();
	}

	public SoKhongKyHan(String maSo, String cMND, String hoTen, double soTienGui, LocalDate ngayLapSo, double laiSuat) {
		super(maSo, cMND, hoTen, soTienGui, ngayLapSo, laiSuat);
	}

	@Override
	public double tienLai() {
		double thangGui = ngayLapSo.until(LocalDate.now()).toTotalMonths();
		return soTienGui*laiSuat*thangGui;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", maSo, cMND, hoTen, df.format(soTienGui), ngayLapSo.format(dt), df.format(laiSuat), df.format(tienLai()));
	}
	
	
}
