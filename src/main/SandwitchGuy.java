package main;

public class SandwitchGuy extends Employee {
	
	private int sandwitchNum;
	
	public SandwitchGuy (String name, double salary, int cn) {
		super (name, salary);
		sandwitchNum = cn;
		}
	public void setSandwitchNo(int cn) {
		sandwitchNum = cn; 
		}
	public double printIncome() {
		return sandwitchNum*100;
		
	}
	
}
