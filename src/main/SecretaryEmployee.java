package main;

public class SecretaryEmployee extends Employee {

	private int lateness;
	private double rate;

	public SecretaryEmployee(String n, double s, int l, double r) {
		super(n, s);
		lateness=l;
		rate = r;
	}

	public void setLateness(int l) {

		lateness = l;

	}

    public double printIncome() {

        return baseSalary - lateness * rate;

    }



}