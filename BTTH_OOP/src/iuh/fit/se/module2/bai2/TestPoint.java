package iuh.fit.se.module2.bai2;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(3, -4 ,"hehe");
		p1.Negate();
		System.out.println(p1);
		System.out.println(p1.getDistance());
	}
}
