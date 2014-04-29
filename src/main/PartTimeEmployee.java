package main;

public class PartTimeEmployee extends Employee
{
	private int workhours;
	private int workdays;
	private double hourlywage;
	
	//calculates the monthly income by multiplying the days per month, the hours per day and the hourlywage
	public static double calculateIncome(int h,int d,double w)
	{
		double n = h*d*w;
		return n;
	}
	
	public PartTimeEmployee(String s,int h,int d,double w) 
	{
		super(s, calculateIncome(h,d,w));
		workhours=h;
		workdays=d;
		hourlywage=w;
		
	}
}
