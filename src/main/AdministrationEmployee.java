package main;

public class AdministrationEmployee extends Employee{



	private int absenses;
	
	public AdministrationEmployee (String n, double s, int a) {
		super(n, s);	
	  	absenses=a;
	}
		
	public void setAbsenses(int a) {
		absenses = a;
	}
			
	public double printIncome() {
	   	return baseSalary - absenses * 80 ;
	}
	    
	

	
}