package ck4;

import java.text.DecimalFormat;

public class ProjectLeader extends Programmer {

	public ProjectLeader() {
		super();
	}

	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
	}
	
	@Override
	public double getMonthlySalary() {
		return theLanguage.equals("Java") ? theBasicMonthlySalary + 0.4* theBasicMonthlySalary : theBasicMonthlySalary + 0.2* theBasicMonthlySalary;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$#,##0.0");
		return String.format("%5d %-15s %-15s %-15s %-15s", thePayrollNumber, theName, df.format(theBasicMonthlySalary), df.format(getMonthlySalary()), theLanguage);
	}
}
