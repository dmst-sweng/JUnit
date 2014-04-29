package main;

public class HRDirector extends Employee {
	
	String name;
	double income;
	double assesmentGrade; //the grade with which the director has been assesed by his seniors(between 0-1)

	public HRDirector(String n, double i, double ag) {
		super(n, i);
		name = n;
		income = i;
		assesmentGrade = ag;		
	}
	
	public double printIncome() {
        return income+income*assesmentGrade*0.2;
    }
}
