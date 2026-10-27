package ck4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SoftwareHouse {
	private String theName;
	List<Employeee> list;
	public SoftwareHouse(String theName) {
		this.theName = theName;
		this.list = new ArrayList<Employeee>();
	}
	public String getTheName() {
		return theName;
	}
	public void setTheName(String theName) {
		this.theName = theName;
	}
	
	//them
	public boolean addEmployee(Employeee x) {
		for (Employeee e : list) {
			if(e.getThePayrollNumber()==x.getThePayrollNumber())
				return false;
		}
		if(x==null) return false;
		list.add(x);
		return true;
	}
	//tra ve
	public List<Employeee> displayAllStaff(){
		return list;
	}
	
	//tinh tong tien
	public double getMonthSalaryBill() {
		double sum =0;
		for (Employeee e : list) {
			sum+= e.getMonthlySalary();
		}
		return sum;
	}
	
	//sap xep nhan vien theo ten
	public List<Employeee> sortAllStaff(){
		return list.stream()
				.sorted((o1,o2) -> o1.getTheName().compareTo(o2.getTheName()))
				.toList();
	}
	//tra ve thong tin cua lap trinh vien
	public List<Employeee> displayListProgrammers(){
		return list.stream()
				.filter(a -> a instanceof Programmer)
				.map(a -> (Programmer)a)
				.collect(Collectors.toList());
	}
	
	//cap nhat phong ban
	public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
		for (Employeee e : list) {
			if(e instanceof Administrator) {
				if(e.getThePayrollNumber()== aPayrollNo) {
					((Administrator) e).setTheDepartment(deptNew);
					return true;
				}
				
			}
		}
		return false;
	}
	//xoa
	public boolean deleteEmployeee(int id) {
		for (Employeee e : list) {
			if(e.getThePayrollNumber()==id) {
				list.remove(id); return true;
			}
		}
		return false;
	}
	
}
