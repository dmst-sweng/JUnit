package main;

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
		return "Name: " + super.name + 
				"\nFinal Income: " + EmployeeIncome(overTimeHours, commission) + " Euros";
	}

}
