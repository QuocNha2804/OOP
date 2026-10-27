package iuh.fit.se.module2.bai5;

public class Triangle {
	private int ma,mb,mc;
	public Triangle() {
		this(0,0,0);
	}
	public Triangle(int ma, int mb, int mc) {
		this.setEdges(ma, mb, mc);
	}
	public int getMa() {
		return this.ma;
	}
	public int getMb() {
		return this.mb;
	}
	public int getMc() {
		return this.mc;
	}
	public void setEdges(int a, int b, int c) {
		if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) {
			this.ma =a;
			this.mb = b;
			this.mc = c;
		}
		else
			System.out.println("Do dai cac canh khong ho le");
		
	}
	public double perimeter() {
		return this.ma+this.mb+this.mc;
	}
	public double area() {
		return Math.sqrt((double)perimeter()/2 *((double)perimeter()/2 - this.ma)*((double)perimeter()/2 - this.mb)*((double)perimeter()/2 - this.mc));
	}
	public String typeTriangle() {
		if(this.ma == this.mb) {
			if(this.ma == this.mc)
				return "Tam giac deu";
			else
				return "Tam giac can";
			
		}
		else if(this.ma+ this.mb > this.mc||this.ma+ this.mc > this.mb||this.mc+ this.mb > this.ma ) {
			
		      if(Math.pow(this.ma,2)+Math.pow(this.mb,2)==Math.pow(mc, 2)||Math.pow(this.ma,2)+Math.pow(this.mc,2)==Math.pow(mb, 2)||Math.pow(this.mc,2)+Math.pow(this.mb,2)==Math.pow(ma, 2) )
			     return "Tam giac vuong";
		      else
		    	  return "Tam giac thuong";
	}
		else
			return"Khong phai la tam giac";
	}
	@Override
	public String toString(){
		return String.format("%-5d %-5d %d%20s %5.2f %5.2f",ma,mb,mc,typeTriangle(),perimeter(),area());
	}
	
	
	
	
	
}
	
	
