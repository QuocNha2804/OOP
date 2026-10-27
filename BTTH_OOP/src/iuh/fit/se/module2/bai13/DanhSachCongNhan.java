package iuh.fit.se.module2.bai13;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachCongNhan {
	private CongNhan [] dsCN;
	private int count=0;
	public DanhSachCongNhan(int n) {
		if(n<0)
			throw new RuntimeException("So phan tu lon hon 0");
		else 
			dsCN = new CongNhan[n];
	}
	
	public void themCN(CongNhan x) {
		if( x == null)
			throw new RuntimeException("Cong nhan khong duoc rong");
		if(count == dsCN.length) {
			throw new RuntimeException("Mang day");
//			int newLength = (int)(dsCN.length*1.5);
//			for( int i =0;i<count;i++) {
//				temp[i] = dsCN[i];
//			}
//			dsCN = temp;
		}
		dsCN[count++] = x;
		
	}
	public CongNhan[] getDSCN() {
		return dsCN;
	}
	
	public int getSoLuongCN() {
		return count;
	}
	
	public void timCN200SP() {
		for( int i =0;i< count;i++) {
			int temp = dsCN[i].getmSoSP();
			if(temp>200) {
				System.out.println(dsCN[i]);
			}
		}
	}
	public CongNhan[] sapxep() {
		CongNhan[] temp = Arrays.copyOf(dsCN, count);
		Arrays.sort(temp, new Comparator<CongNhan>() {
			@Override
			public int compare (CongNhan o1, CongNhan o2) {
				return Integer.compare(o2.getmSoSP(), o1.getmSoSP());
			}
		});
		return temp;
	}
}
