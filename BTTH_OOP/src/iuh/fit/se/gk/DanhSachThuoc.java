package iuh.fit.se.gk;
import java.time.LocalDate;
public class DanhSachThuoc {
	private Thuoc[] dsThuoc;
	private int count =0;
	public DanhSachThuoc() {
		dsThuoc = new Thuoc[10];
	}
	
	public DanhSachThuoc(int n) {
		if(n< 0)
			throw new RuntimeException("So phan tu mang phai >0");
		else
			dsThuoc = new Thuoc[n];
	}
	
	
	//them
	public void themThuoc(Thuoc x) {
		if(x==null) {
			throw new RuntimeException("Thuoc khong duoc rong");
			
		}
		for(int i =0;i<count;i++) {
			if(x.getMaSo().equalsIgnoreCase(dsThuoc[i].getMaSo())) {
				throw new RuntimeException("Khong duoc trung ma");
			}
		}
		if(dsThuoc.length == count) {
			int newLength = (int)(dsThuoc.length * 1.75);
			if(newLength >10000)
				throw new RuntimeException("Kich thuoc mang khong vuot qua 10000");
			Thuoc[] temp = new Thuoc[newLength];
			for( int i =0;i<count;i++) {
				temp[i]= dsThuoc[i];
			}
			dsThuoc = temp;
		}
		dsThuoc[count++] = x;
	}
	
	//xoa
	public void xoaThuoc(String maThuoc) {
		for(int i=0;i<count;i++) {
			String temp = dsThuoc[i].getMaSo();
			LocalDate ngayhh = dsThuoc[i].getNgayHetHan();
			if(temp.equalsIgnoreCase(maThuoc) && ngayhh.isBefore(LocalDate.now())) {
				for( int j=i;j<count-1;j++) {
					dsThuoc[j]=dsThuoc[j+1];
				}
				dsThuoc[count-1]=null;
				count--;
				i--;
			}
		}
		
	}
	// ham de in danh sach thuoc ben lop kiem nghiem
	public Thuoc[] getDSThuoc() {
		return dsThuoc;
	}

}
