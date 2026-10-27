package iuh.fit.se.module2.bai2;

public class Point {
	private int x,y;
	private String ten;
	public Point() {
		this(0,0,"");
	}
	public Point(int x, int y, String ten) {
		this.x =x;
		this.y =y;
		this.ten=ten;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void Negate() {
		this.x = -this.x;
		this.y = -this.y;
	}
	public double getDistance() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	@Override
	public String toString() {
		return String.format(ten+"("+x+","+y+")");
	}

}
