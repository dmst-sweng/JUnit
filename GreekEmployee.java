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
		if (Edul.equals("Bachelor")) return 100;
		else if (Edul.equals("Master")) return 200;
		else if (Edul.equals("PHD")) return 400;
		else return 0;
	}
	
	//Lets assume that JohnDoe is our coffee guy.
	public int bonusForTheCoffeeGuy(String name) {
		int bonus;
		boolean isTheCoffeeGuy;
		if (name.equals("JohnDoe")){
			isTheCoffeeGuy=true;
		} else {
			isTheCoffeeGuy=false;
		}
		bonus= isTheCoffeeGuy? 50 : 0;
		return bonus;
	}
	
	public double printIncome() {
		return baseSalary + EdulevelPayment(EduLevel) +(overtimeHours * rate)+bonusForTheCoffeeGuy(name);
	}

}

