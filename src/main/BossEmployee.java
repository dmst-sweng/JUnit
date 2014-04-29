package main;

public class BossEmployee extends Employee {
	
	private int WorkingTime;
	private double Timesalary;
	private double BonusBoss;

	public BossEmployee(String n, double s, int wt, double ts, double bb) {
		super(n, s);
		WorkingTime = wt;
		BonusBoss = bb;
		Timesalary = ts;
	}
	
	public void setTimesalary(int ts) {
		Timesalary = ts;
	}

	public double printIncome() {
		return baseSalary + WorkingTime*Timesalary + BonusBoss;
	}
	
}
