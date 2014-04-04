package main;

public class GreekEmployee extends Employee {
	  
	private int overtimeHours;
	private double rate;
	private String EduLevel;
	
	 
	public GreekEmployee(String n, double s, String Edl, int o, double r ) {
		super(n, s);
		overtimeHours =o ;
		rate = r;
		EduLevel=Edl;
		
				
	}

	
public int EdulevelPayment(String Edul){
	
if (Edul=="Bachelor") return 100;
else if (Edul=="Master") return 200;
else if (Edul=="PHD") return 400;
else return 0;

}


	public double printIncome() {
		
		return baseSalary + EdulevelPayment(EduLevel) +overtimeHours * rate  ;    }
	

}
