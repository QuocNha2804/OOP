package ck4;

import java.text.DecimalFormat;

public class Programmer extends Employeee {
	protected String theLanguage;

	public Programmer() {
		super();
		this.theLanguage = "";
		
	}

	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theLanguage = theLanguage;
	}

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}

	@Override
	public double getMonthlySalary() {
		return theLanguage.equals("Java") ? theBasicMonthlySalary + 0.2* theBasicMonthlySalary : theBasicMonthlySalary;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,##0.0");
		return String.format("%5d %-15s %-15s %-15s %-15s", thePayrollNumber, theName, df.format(theBasicMonthlySalary), df.format(getMonthlySalary()), theLanguage);
	}
	
	
	
}
