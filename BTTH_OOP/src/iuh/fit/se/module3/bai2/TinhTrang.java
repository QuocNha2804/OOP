package iuh.fit.se.module3.bai2;

public enum TinhTrang {
	MOI("Moi"),CU("Cu");
	private String tinhtrang;
	
	private TinhTrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	@Override
	public String toString() {
		return tinhtrang;
	}
}
