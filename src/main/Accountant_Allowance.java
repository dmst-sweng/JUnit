package main;

public class Accountant_Allowance extends Employee {

	private double allowance;

	public Accountant_Allowance (String name, double salary, double al) {
		super(name, salary);
	  	allowance=al;
	}

	public void setAllowance(double al) {
		allowance=al;
	}

	public double printSumAllowance() {
	   	return baseSalary + allowance;
	}




}