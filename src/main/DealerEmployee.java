package main;

public class DealerEmployee extends Employee {
	
    private double dealsMadeDollars;
	private double commission;

	public DealerEmployee(String name, double baseSalary, double dmd, double c) {
		super(name, baseSalary);
		dealsMadeDollars = dmd;
		commission = c;
	}
	
	public double printIncome() {
		return baseSalary + dealsMadeDollars*commission;
	}
	
}
