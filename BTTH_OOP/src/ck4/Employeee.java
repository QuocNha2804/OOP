package ck4;

import java.text.DecimalFormat;

public abstract class Employeee {
	protected final int thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;
	public Employeee() {
		this(0,"",0.0);
	}
	public Employeee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}
	public String getTheName() {
		return theName;
	}
	public void setTheName(String theName) {
		this.theName = theName;
	}
	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}
	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}
	public int getThePayrollNumber() {
		return thePayrollNumber;
	}
	
	public abstract double getMonthlySalary();
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,##0.0");
		return String.format("%5d %-15s %-15s %-15s", thePayrollNumber, theName, df.format(theBasicMonthlySalary), df.format(getMonthlySalary()));
	}
	
	
	
}
