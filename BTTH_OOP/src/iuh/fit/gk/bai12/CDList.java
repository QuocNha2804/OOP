package iuh.fit.gk.bai12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CDList {
	private CD[] dscd;
	private int count =0;
	public CDList() {
		dscd = new CD[10];
	}
	public CDList(int n) {
		if(n<=0)
			throw new RuntimeException("So phan tu >0");
		dscd = new CD[n];
	}
	public boolean themCD(CD cd) {
		if(cd == null) return false;
		for(int i =0;i<count;i++) {
			if(dscd[i].getMaCD()== cd.getMaCD()) return false;
		}
		if(count == dscd.length) {
			int newLength = (int)(dscd.length*1.5);
			CD[] temp = new CD[newLength];
			for(int i =0;i<count;i++) {
				temp[i] = dscd[i];
			}
			dscd = temp;
		}
		dscd[count++] = cd;
		return true;
	}
	public CD[] getDSCD() {
		return dscd;
	}
	
	public int getSoLuongCD( LoaiCD loaiCD) {
		int cnt =0;
		for(int i =0;i<count;i++) {
			if(dscd[i]!=null && dscd[i].getLoaiCD()== loaiCD)
				cnt++;
		}
		return cnt;
	}
	
	public void xoaCD(int maCD) {
		for(int i =0;i<count;i++) {
			if(dscd[i]!=null && dscd[i].getMaCD()==maCD) {
				for(int j =i;j<count-1;i++) {
					dscd[j] = dscd[j+1];
				}
				dscd[count -1] = null;
				count --;
				i--;
			}
		}
	}
	
	public double getTongGiaThanh() {
		double sum =0;
		for(int i =0;i<count;i++) {
			sum+= dscd[i].getGiaThanh();
		}
		return sum;
	}
	
	public CD timKiem( int maCD) {
		for(int i =0;i<count;i++) {
			if(dscd[i].getMaCD() == maCD) return dscd[i];
		}
		return null;
	}
	
	public void suaThongTin(int maCD) {
		for(int i =0;i<count;i++) {
			if(dscd[i].getMaCD()== maCD) {
				Scanner sc = new Scanner(System.in);
				//tua cd
				System.out.println("Nhap tua CD moi");
				String tuaCDNew = sc.nextLine();
				dscd[i].setTuaCD(tuaCDNew);
				//so bai hat
				System.out.println("Nhap so bai hat");
				int soBaiHatNew = sc.nextInt();
				dscd[i].setSoBaiHat(soBaiHatNew);
				//Loai cd
				sc.nextLine();
				System.out.println("Nhap loai cd");
				String loaiCDnhap = sc.nextLine();
				LoaiCD  loaiCDnew = LoaiCD.valueOf(loaiCDnhap.toUpperCase());
				dscd[i].setLoaiCD(loaiCDnew);
				//Gia Thanh
				System.out.println("Nhap gia thanh moi");
				double giaThanhNew = sc.nextDouble();
				dscd[i].setGiaThanh(giaThanhNew);
				break;
				
			}
		}
	}
	
	public CD[] giaThanhMax() {
		CD[] temp = new CD[dscd.length];
		double max = dscd[0].getGiaThanh();
		for(int i =1;i<count;i++) {
			if(dscd[i].getGiaThanh()>max)
				max = dscd[i].getGiaThanh();
		}
		int tmp = 0;
		for(int i =0;i<count;i++) {
			if(dscd[i].getGiaThanh()==max)
				temp[tmp++] = dscd[i];
		}
		return temp;
	}
	
	public CD[] sapXepGiaThanhGiam() {
		CD[] temp = Arrays.copyOf(dscd, count);
		Arrays.sort(temp, new Comparator<CD>() {
			@Override
			public int compare(CD o1, CD o2) {
				return Double.compare(o2.getGiaThanh(), o1.getGiaThanh());
			}
		});
		return temp;
	}
	
	public CD[] sepXepTuaCDTang() {
		CD[] temp = Arrays.copyOf(dscd, count);
		Arrays.sort(temp, new Comparator<CD>() {
			@Override
			public int compare(CD o1, CD o2) {
				return o1.getTuaCD().compareToIgnoreCase(o2.getTuaCD());
			}
		});
		return temp;
	}
	
}
