package main;

public class AdminEmployee extends Employee {

    private double bonus;
    private double extraDaysOff;
    
    public AdminEmployee(String n, double s, double b, double daysOff) {
        super(n, s);
        bonus = b;
    }

    public void setBonus(double b) {
        bonus = b;
    }
    
    
    public void setextraDaysOff (double daysOff) {
    	extraDaysOff = daysOff;
    }
    
    public double getExtraDaysOff() {
    	return this.extraDaysOff;
    }

    public double getBonus() {
        return this.bonus;
     }
    
    public double printIncome() {
        return baseSalary + bonus;
    }
}

