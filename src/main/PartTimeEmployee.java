package main;

public class PartTimeEmployee extends Employee
{
	private int hours;
	private int days;
	private double hourlyWage;
		
	public PartTimeEmployee(String n,double s,int h,int d,double w) 
	{
		super(n,s);
		hours= h;
		days= d;
		hourlyWage=w;
		
	}
	
	//print the monthly income by multiplying the days per month, the hours per day and the hourlywage
		public double printIncome()
		{
			
			return hours*days*hourlyWage;
		}
}
