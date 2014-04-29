package main;

public class FinancialEmployee extends Employee {
	
	private int extradays;
	private double rate;
	private int lateness;
	private double latenessrate;
	private int bonus;
	private double bonusrate;

	public FinancialEmployee(String n, double s, int ed, double r, int l, double lr, int b, double br) {
		super(n, s);
		extradays = ed;
		rate = r;
		lateness = l;
		latenessrate = lr;
		bonus = b;
		bonusrate = br;
	}

	public void setExtraDays(int ed) {
		extradays = ed;
	}

	public void setLateness(int l) {
		 lateness = l;
	}
	
	public void setBonus(int b) {
		 bonus = b;
	}

	public double printIncome() {
		return baseSalary + extradays*rate - lateness*latenessrate + bonus*bonusrate;
	}
	
}
