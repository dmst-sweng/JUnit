package main;

public class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String n, double s) { 
	name = n;
	baseSalary = s;
    }

    public double printIncome() {
	return baseSalary;
    }
}

