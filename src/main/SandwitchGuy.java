package main;

import etc.SandwitchType;

public class SandwitchGuy extends Employee {
	
	private int sandwitchNum;
	private SandwitchType sandwitchType;
	
	public SandwitchGuy (String name, double salary, int cn, SandwitchType st) {
		super (name, salary);
		sandwitchNum = cn;
		sandwitchType = st;
	}
	
	public void setSandwitchNo(int cn, SandwitchType st) {
		sandwitchNum = cn;
		sandwitchType = st;
	}
	
	public int getSandwitchTypeValue() {
		switch (sandwitchType) {
		case simple:
			return 2;
		default:
			return 1;
		}
	}
	
	public double printIncome() {
		return sandwitchNum*getSandwitchTypeValue();	
	}
	
}
