package main;

public class FinancialEmployee extends Employee {
	
	private int extradays;
	private double rate;
	private int lateness;
	private double latenessrate;

	public FinancialEmployee(String n, double s, int ed, double r, int l, double lr) {
		super(n, s);
		extradays = ed;
		rate = r;
		lateness = l;
		latenessrate = lr;
	}

	public void setExtraDays(int ed) {
		extradays = ed;
	}

	public void setLateness(int l) {
		 lateness = l;
	}

	public double printIncome() {
		return baseSalary + extradays*rate - lateness*latenessrate;
	}
	
}
