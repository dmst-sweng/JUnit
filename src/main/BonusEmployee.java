package main;

public class BonusEmployee extends Employee {

	private double bonus;

	public BonusEmployee (String n, double s, double bn) {
		super(n, s);
	  	bonus=bn;
	}

	public void setBonus(double bn) {
		bonus=bn;
	}

	public double printTotalIncome() {
	   	return baseSalary + bonus ;
	}




}