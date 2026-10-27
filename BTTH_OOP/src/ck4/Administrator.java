package ck4;

import java.text.DecimalFormat;

public class Administrator extends Employeee {
	protected String theDepartment;

	public Administrator() {
		super();
		this.theDepartment = "";
	}

	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}

	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary+0.4*theBasicMonthlySalary;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,##0.0");
		return String.format("%5d %-15s %-15s %-15s %-15s", thePayrollNumber, theName, df.format(theBasicMonthlySalary), df.format(getMonthlySalary()), theDepartment);
	}
	
}
