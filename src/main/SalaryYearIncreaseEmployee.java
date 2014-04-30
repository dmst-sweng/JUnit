package main;

public class SalaryYearIncreaseEmployee extends Employee {

    private int year;

    public SalaryYearIncreaseEmployee(String n, double s, int y) {
        super(n, s);
        this.year = y;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return this.year;
     }
    
    public double totalYearsSalary() {
        
        if (year >= 20) {
        return baseSalary + baseSalary*0.75; }

        else if (year >5 & year<20) {
        return baseSalary + baseSalary*0.50; }

        else {
        return baseSalary + baseSalary*0.25; }
        

    }
}

