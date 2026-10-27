package ck2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DanhSachSoTK {
	List<SoTK> dss;
	public DanhSachSoTK() {
		this.dss = new ArrayList<SoTK>();
	}
	public DanhSachSoTK(ArrayList<SoTK> dss) {
		this.dss = dss;
	}
	
	//them
	public boolean themSo(SoTK so) {
		for (SoTK s : dss) {
			if(so.getMaSo().equals(s.getMaSo()))
				return false;
		}
		dss.add(so);
		return true;
	}
	
	//dem so luong so theo CMND
	public int demSoTheoCMND(String cMND) {
		int cnt =0;
		for (SoTK s : dss) {
			if(s.getcMND().equals(cMND))
				++cnt;
		}
		return cnt;
	}
	
	//lay danh sach cac so co ky han co so tien gui lon nhat
	public List<SoTK> getDSSoCoKyHanTienMax(){
		double max = dss.stream()
				.filter(a -> a instanceof SoCoKyHan)
				.map(a -> (SoCoKyHan)a)
				.mapToDouble(SoCoKyHan::getSoTienGui)
				.max()
				.orElse(0);
		return dss.stream()
				.filter(a -> a instanceof SoCoKyHan)
				.map(a -> (SoCoKyHan) a)
				.filter( a -> a.getSoTienGui() == max)
				.collect(Collectors.toList());
				
	}
	// lay danh sach cac so mo trong thang x nam y
	public List<SoTK> getDSSoMoTrongThangNam( int x, int y){
		return dss.stream()
				.filter(a -> a.getNgayLapSo().getYear()==y)
				.filter(a -> a.getNgayLapSo().getMonthValue()==x)
				.toList();
	}
	
	//sap xep cac so giam dan theo ngay lap so
	public List<SoTK> sapXepSoTheoNgayLapSo(){
		return dss.stream()
				.sorted((o1,o2) -> o2.getNgayLapSo().compareTo(o1.getNgayLapSo()))
				.toList();
	}
	//in danh sach
	public void getDSS() {
		for (SoTK s : dss) {
			System.out.println(s);
		}
	}
	
}
