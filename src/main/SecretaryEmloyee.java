package main;

public class SecretaryEmloyee extends Employee {

	private int lateness;
	private double rate;
	
	public SecretaryEmloyee(String n, double s, int l, double r) {
		super(n, s);		
		lateness=l;
		
	}

	public void setLateness(int l) {
		lateness = l;
	}
	
    public double printIncome() {
        return baseSalary - lateness * rate;
    }

}
