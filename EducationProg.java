package main;


import etc.TypesOfEducation;

/**
 * Every instance of this class represents a base EducationProgram.
 */
public class EducationProg {
	/**
	 * The program's type
	 */
	protected TypesOfEducation type;
	/**
	 * The program's unique code
	 */
	protected String pcode;
	/**
	 * The program's name
	 */
	protected String name;
	/**
	 * The program's duration in weeks
	 */
	protected double duration; 
	/**
	 * The program's cost per Employee
	 */
	protected double costPerPerson;

	/**
     * Overloaded constructor
     * 
     * @param n The name of the education program.
     * @param c The code of the education program.
     * @param d The duration of the education program.
     * @param cost The costPerPerson of the education program.
     * @param t The type of education program.
     */
	public EducationProg(String n, String c, double d, double cost, TypesOfEducation t) {
		this.name = n;
		this.pcode = c;
		this.duration = d;
		this.costPerPerson = cost;
		this.type = t;
	}  
		
	 
	/**
     * Returns the education 's code
     * 
     * @return The code.
     */
	public String getCode() {
		return this.pcode;
    
	}
	
	
	/**
     * Returns the type of education
     * 
     * @return The type.
     */
	public TypesOfEducation getType() {
		return this.type;
    
	}
}
