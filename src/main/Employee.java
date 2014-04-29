package main;

import java.util.ArrayList;
import java.util.List;

import etc.Languages;


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
     * The languages that the current employee can speak.
     */
    protected List<Languages> languages;
    
    /**
     *  An employee's statutory employment leave. 
     */
    protected int sel;
    
    /**
     * Variable to see if the employee is currently working (true), or has been 
     * working in this corporation in the past (false).
     */   
    protected boolean isEmployed;
    
    
    /**
     * Base constructor.
     * 
     * @param n The name of the employee.
     * @param s The base salary of the employee.
     * @param e The employees' status is set to employed (isEmployed = true), since
     * 			the constructor is only called when a new employee is hired.
     */
    public Employee(String n, double s) { 
    	this(n , s , "-1");
    	this.isEmployed = true;
    }
    
    
    /**
     * Overloaded constructor
     * 
     * @param n The name of the employee.
     * @param s The base salary of the employee.
     * @param ssn The ssn of the employee.
     * @param e The employees' status is set to employed (isEmployed = true), since
     * 			the constructor is only called when a new employee is hired.
     */
    public Employee(String n , double s , String ssn) {
    	this.name = n;
    	this.baseSalary = s;
    	this.ssn = ssn;
    	this.languages = new ArrayList<Languages>();
    	this.sel=20;
    	this.isEmployed = true;
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
     * Assuming the income is yearly this method converts
     * the yearly income into a monthly income to better fit 
     * Greek standards 
     */
    
    public double printMonthlyWage() {
    	return (this.baseSalary)/12;
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
    
    
    /**
     * Adds a new language to the current employee.
     * 
     * @param lang The new language to be added.
     */
    public void addLanguage(Languages lang) {
    	if( (lang != null) && !(this.languages.contains(lang)) )
    		this.languages.add(lang);
    }
    
    
    /**
     * Removes a language from the current employee.
     * 
     * @param lang The language to be removed.
     * @return true , if the language was deleted , 
     * 	or false if there was no such language
     */
    public boolean removeLanguage(Languages lang) {
    	if (!this.languages.contains(lang)) return false;
    	
    	this.languages.remove(lang);
    	return true;
    }
    
    
    /**
     * Returns a copy of the list of the 
     * employee's languages.
     * 
     * @return A list of the employee's languages.
     */
    public List<Languages> getLanguages() {
    	return new ArrayList<Languages>(this.languages);
    }
    
    
    /**
     *   Sets the employee's statutory employment leave , to the value given as parameter.
     * 
     * @param sel The new statutory employment leave of the employee.
     */
    public void setStatutoryEmploymentLeave(int sel) {
    	this.sel = sel;
    }
    
    
    /**
     * Returns the number of days that correspond to employee's
     * statutory employment leave.
     * 
     * @return number of days of statutory employment leave
     */
    public int getStatutoryEmploymentLeave() {	
    	return this.sel;
    }
    
    /**
     * Returns the number of days that correspond to employee's
     * statutory employment leave.
     * 
     * I didn't like the word "Fire" so I used "Dismiss" :P
     */
    public void dismissEmployee() {	
    	this.isEmployed = false;
    }
    
    /**
     * Returns if the Employee is currently employed (true) or dismissed (false)
     */
    public boolean isEmployeeDismissed() {	
    	return this.isEmployed;
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
    	return 41 * 
               (41 * 
                (41 + this.name.hashCode() ) + 
                  (int)this.baseSalary ) + 
                   this.ssn.hashCode();
    }
    
    
    @Override
    public String toString() {
    	
    	String langs = "\n\tLanguages : ";
    	
    	for(Languages l : this.languages) 
    		langs += (langs.equals("\n\tLanguages : "))?l:(" , " + l);
    	
    	return "Employee : \n\tName : " + this.name + 
    			"\n\tBase salary : " + this.baseSalary + 
    			"\n\tSSN : " + this.ssn +
    			"\n\tStatutory Employment Leave : " + this.sel +
    			langs;
    }
}