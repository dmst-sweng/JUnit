package main;

public class ParentEmployee extends Employee {

	private int childrenNum;
	
	 public ParentEmployee (String n, double s, int cn) {
	 super(n, s);	
	  childrenNum=cn;
	  }
		
	public void setChildrenNum(int cn) {
	 childrenNum = cn;
	 }
			
	 public double printIncome() {
	    return baseSalary + childrenNum * 50 ;
	    }
	    
	

	
}