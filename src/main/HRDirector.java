package main;

public class HRDirector extends Employee {
	
	String name;
	double income;

	public HRDirector(String n, double i) {
		super(n, i);
		name = n;
		income = i;		
	}
	
	public double printIncome() {
        return income;
    }
}
