package iuh.fit.se.module2.bai12;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachCD {
	private CD []dsCD;
	private int count=0;
	
	public DanhSachCD( int n) {
		if( n <= 0) {
			throw new IllegalArgumentException("So phan tu > 0");
			
		}
		else
			dsCD = new CD[n];
	}
	 
	public void themCD(CD x) {
		if( x == null) {
			throw new RuntimeException("CD khong duoc null");
		}
		if( count == dsCD.length) {
	//		throw new RuntimeException("Mang day");
			int newLength = (int)(dsCD.length * 1.5);
			CD []temp = new CD[newLength];
			for( int i =0; i< dsCD.length;i++) {
				temp[i] = dsCD[i];
			}
			dsCD = temp;
		}
		for( int i =0;i< count;i++) {
			CD temp = dsCD[i];
			if(x.getMaCD()== temp.getMaCD()) {
				throw new RuntimeException("Khong duoc trung ma");
			}
		}
		dsCD[count++] = x;
		
		
	}
	
	
	
	public CD[] getDSCD() {
		return dsCD;
	}
	
	public int getCount() {
		return count;
	}
	
	public void xoaCD( int maCD) {
		for( int i = 0;i< count;i++) {
			int temp = dsCD[i].getMaCD();
			if(maCD == temp) {
				for( int j = i;j<count;j++) {
					dsCD[j]=dsCD[j+1];
				}
			}
			
		}
		dsCD[count-1]=null;
		count --;
	}
	public double tongGiaThanh() {
		double sum =0;
		for( int i =0;i<count;i++) {
			double temp  = dsCD[i].getGiaThanh()*dsCD[i].getSoBaiHat();
			sum+=temp;
		}
		return sum;
	}
	public void timCD( int maCD) {
		int flag =0;
		for( int i = 0;i<count;i++) {
			int temp = dsCD[i].getMaCD();
			if(temp == maCD) {
				flag =1;
				System.out.println(dsCD[i]);
			}
		}
		if(flag ==0)
			System.out.println("Khong tim thay");
		
	}
	public CD[] sapxepGiaThanh() {
		CD []temp = Arrays.copyOf(dsCD, count);
		Arrays.sort(temp, new Comparator<CD>() {
			@Override
			public int compare( CD o1, CD o2) {
				return Double.compare(o2.getGiaThanh(), o1.getGiaThanh());
			}
		}
		);
		return temp;
	}
	
	public CD[] sapxepTuaCD() {
		CD[] temp = Arrays.copyOf(dsCD, count);
		Arrays.sort(temp, new Comparator<CD>() {
			@Override
			public int compare( CD o1, CD o2) {
				return o1.getTuaCD().compareToIgnoreCase(o2.getTuaCD());
			}
		});
		return temp;
	}
	
	
	
	
}
