package main;

public class FinancialEmployee extends Employee {
	
	private int extradays;
	private double rate;

	public FinancialEmployee(String n, double s, int ed, double r) {
		super(n, s);
		extradays = ed;
		rate = r;
	}
	
	public void setExtraDays(int ed) {
		extradays = ed;
	}

	public double printIncome() {
		return baseSalary + extradays*rate;
	}
	
}
