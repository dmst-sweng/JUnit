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
}