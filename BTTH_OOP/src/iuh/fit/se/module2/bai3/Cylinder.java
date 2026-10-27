package iuh.fit.se.module2.bai3;

public class Cylinder {
	private int r,h;
	public Cylinder() {
		this(0,0);
	}
	public Cylinder(int r, int h) {
		this.r=r;
		this.h=h;
	}
	public double dtxungquanh() {
		return 2*Math.PI*r*h;
	}
	public double dttoanphan() {
		return dtxungquanh() + 2*Math.PI*Math.pow(r, 2);
				
	}
	public double thetich() {
		return Math.PI*Math.pow(r,2);
	}
	@Override
	public String toString(){
		return String.format("Chieu cao: %d, ban kinh: %d, dtxq: %.2f, dttp: %.2f, tt:%.2f",h,r,dtxungquanh(),dttoanphan(),thetich());
	}
}
