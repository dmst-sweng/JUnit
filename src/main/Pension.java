package main;

public class Pension  {

    protected int years;//*years of service
    protected double salary;//*last salary
    protected boolean married;//*married or not
    protected int children;//*number of children
    protected double amount;

    public  Pension(int y, double s, boolean m, int c) {
    	this.years = y;
    	this.salary = s;
    	this.married = m;
    	this.children = c;
    }

    public double calculatePension() {
    if (years < 25) return 0;
    else {
        amount = salary * years / 35;
        if (married == true) {
            amount += 100;                    
        }
        if (children > 0){
            amount += children * 50;
        }
    return amount;
    }
}
 
}

