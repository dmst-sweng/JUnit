package main;

import java.text.DecimalFormat;


public class SalesEmployee extends Employee{
	
	public int overTimeHours;
	public float commission;
	public final int costOfOverTimeHour = 6;
	public double totalSales;

	public SalesEmployee(String n, double s, int oth, float c, double sales) {
		super(n, s);
		overTimeHours = oth;
		commission = c;
		totalSales = sales;
	}
	
	public double EmployeeIncome (int hours, float com) {
		
    return super.baseSalary + hours * costOfOverTimeHour + totalSales * commission;
	
	}
	
	@Override
	public String toString() {
	    DecimalFormat f = new DecimalFormat("0.00");
		return "Name: " + super.name + "  " +
				"Final Income: " + f.format(EmployeeIncome(overTimeHours, commission)) + " Euros";
	}

}
