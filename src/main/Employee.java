package main;

/**
 * Every instance of this class represents a base Employee.
 *  
 * @author dmst-sweng
 */
public class Employee {

	/**
	 * The employee's name.
	 */
    protected String name;
    
    /**
     * The employee's base salary.
     */
    protected double baseSalary;
    
    /**
     * The employee's ssn. Used to uniquely identify an employee.
     */
    protected String ssn;
    
    
    /**
     * Base constructor.
     * 
     * @param n The name of the employee.
     * @param s The base salary of the employee.
     */
    public Employee(String n, double s) { 
    	this(n , s , "-1");
    }
    
    /**
     * Overloaded constructor
     * 
     * @param n The name of the employee.
     * @param s The base salary of the employee.
     * @param ssn The ssn of the employee.
     */
    public Employee(String n , double s , String ssn) {
    	this.name = n;
    	this.baseSalary = s;
    	this.ssn = ssn;
    }

    /**
     * Returns the income of the employee.
     * 
     * @return The base salary.
     */
    public double printIncome() {
    	return this.baseSalary;
    }
    
    /**
     * Returns the employee's ssn
     * 
     * @return The ssn.
     */
    public String getSSN() {
    	return this.ssn;
    }
    
    /**
     * Sets the employee's ssn , to the value given as parameter.
     * 
     * @param ssn The new ssn of the employee.
     */
    public void setSSN(String ssn) {
    	this.ssn = ssn;
    }
    
    /**
     * Returns the employee's name.
     * 
     * @return The name of the Employee.
     */
    public String getName() {
    	return this.name;
    }
    
    @Override
    public boolean equals(Object obj) {
    	
    	if (obj == null) return false;
    	
    	if(this == obj) return true;
    	
    	if(!(obj.getClass().equals(Employee.class))) return false;
    	
    	Employee emp = (Employee)obj;
    	
    	return this.ssn.equals(emp.ssn);
    }
    
    @Override
    public int hashCode() {
    	return 41 * (41 * (41 + this.name.hashCode() ) + (int)this.baseSalary ) + this.ssn.hashCode();
    }
    
    @Override
    public String toString() {
    	return "Employee : \n\tName : " + this.name + "\n\tBase salary : " + this.baseSalary + "\n\tSSN : " + this.ssn;
    }
}