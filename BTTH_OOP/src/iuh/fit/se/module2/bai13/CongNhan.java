package iuh.fit.se.module2.bai13;

public class CongNhan {
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	public CongNhan() {
		this("","",0);
	}
	public CongNhan(String mHo, String mTen, int mSoSP) {
		this.mHo = mHo;
		this .mTen = mTen;
		if( mSoSP>=0)
			this.mSoSP= mSoSP;
		else
			throw new RuntimeException("So SP >=0");
		
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	
	public double tinhLuong() {
		if(mSoSP >=1 && mSoSP <=199)
			return this.mSoSP*0.5;
		else if(mSoSP >=200 && mSoSP <=399)
			return this.mSoSP*0.55;
		else if(mSoSP >=400 && mSoSP <=599)
			return this.mSoSP*0.6;
		else
			return this.mSoSP*0.65;
	}
	@Override
	public String toString() {
		return String.format("%-5s %-10s %-5d %5.2f",mHo,mTen,mSoSP,tinhLuong());
	}
}
