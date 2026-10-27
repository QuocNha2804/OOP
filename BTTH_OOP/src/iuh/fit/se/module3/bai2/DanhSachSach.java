package iuh.fit.se.module3.bai2;

public class DanhSachSach {
	private Sach[] dsSach;
	private int count=0;
	
	public DanhSachSach( int n) {
		if(n <= 0)
			throw new RuntimeException("So luong phan tu >0");
		dsSach = new Sach[n];
	}
	
	public void themSach( Sach sach) {
		if(sach == null)
			throw new RuntimeException("Sach khon duoc rong");
		if(count == dsSach.length) {
			int newlenght = (int)(dsSach.length*1.5);
			Sach [] temp = new Sach[newlenght];
			for( int i =0;i<count;i++) {
				temp[i] = dsSach[i];
			}
			dsSach = temp;
		}
		dsSach[count++] = sach;
	}
	
	public Sach[] getDSSach() {
		return dsSach;
	}
	
	public double tongtienSachGiaoKhoa() {
		double sum=0;
		for( Sach s : dsSach) {
			if(s instanceof SachGiaoKhoa && s!=null)
				sum+= s.getThanhTien();
		}
		return sum;
	}
	public double tongtienSachThamKhao() {
		double sum=0;
		for( Sach s : dsSach) {
			if(s instanceof SachThamKhao && s!=null)
				sum+= s.getThanhTien();
		}
		return sum;
	}
	
	public Sach timSachGiaoKhoa( String K ) {
		for( Sach s : dsSach) {
			if(s instanceof SachGiaoKhoa && s.getNhaXuatBan().equalsIgnoreCase(K)) {
				return s;
			}
		}
		return null;
		
	}
	
	public double timThanhTienMax() {
		double max = dsSach[0].getThanhTien();
		for(int i =1;i<count;i++) {
			if(dsSach[i].getThanhTien()> max)
				max = dsSach[i].getThanhTien();
		}
		return max;
	}
}
