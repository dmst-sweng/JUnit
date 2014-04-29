package main;

public class WorkerEmployee extends Employee {
	
	private int workingHours;
	private double salaryPerHour;

	public WorkerEmployee(String n, double s, int wh, double sph) {
		super(n, s);
		workingHours = wh;
		salaryPerHour = sph;
	}
	
	public void setWorkingHours(int wh) {
		workingHours = wh;
	}

	public double printIncome() {
		return baseSalary + workingHours*salaryPerHour;
	}
	
}
