package main;

public class MarketingEmployee extends Employee {
	
	private int workingHours;
	private double salaryPerHour;
	private double efficiencyBonusPerMonth;
	
	public MarketingEmployee(String name, double salary, int whours, double sph, double ebpm) {
		super(name, salary);
		workingHours = whours;
		salaryPerHour = sph;
		efficiencyBonusPerMonth = ebpm;
	}
	
	public void setWorkingHours(int whours) {
		workingHours = whours;
	}
	
	public double printIncome() {
		return baseSalary + workingHours*salaryPerHour+efficiencyBonusPerMonth;
	}

}
