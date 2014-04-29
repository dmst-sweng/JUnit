package main;

public class AdminEmployee extends Employee {

    private double bonus;

    public AdminEmployee(String n, double s, double b) {
        super(n, s);
        bonus = b;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public double getBonus() {
        return this.bonus;
     }
    
    public double printIncome() {
        return baseSalary + bonus;
    }
}

