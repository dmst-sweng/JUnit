package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import etc.Languages;
import main.Employee;
import main.TechEmployee;

public class EmployeeTest {

	private Employee emp1;
	private Employee emp2;
	private Employee emp3;
	
	/**
	 * Runs before every test.
	 */
	@Before
	public void setUp() {
		this.emp1 = new Employee("EMP1" , 2000.0 , "ABCDE12345");
		this.emp2 = new Employee("EMP2" , 2300.0 , "FGHIJ6789");
		this.emp3 = new Employee("EMP3" , 2500.0 , "FGHIJ6789");
	}
	
	/**
	 * Runs after every test.
	 */
	@After
	public void tearDown() {
		this.emp1 = null;
		this.emp2 = null;
		this.emp3 = null;
	}
	
	@Test
	public void testPrintIncome() {
		Employee e = new Employee("John", 1250.50);
		assertEquals(1250.50, e.printIncome(), 0.1);
	}
  
  
	/**
	 * First function to test the Employee equality method.
	 */
	@Test
	public void testEquals1() {
		assertFalse(emp1.equals(null));
	}
	
	/**
	 * Second function to test the Employee equality method.
	 */
	@Test
	public void testEquals2() {
		assertTrue(emp1.equals(emp1));
	}
	
	/**
	 * Third function to test the Employee equality method.
	 */
	@Test
	public void testEquals3() {
		TechEmployee tEmp = new TechEmployee("TEmp1" , 2000.0  , 5 , 200.0);
		assertFalse(emp1.equals(tEmp));
	}
	
	/**
	 * Fourth function to test the Employee equality method.
	 */
	@Test
	public void testEquals4() {
		assertFalse(emp1.equals(emp2));
	}
	
	/**
	 * Fifth function to test the Employee equality method.
	 */
	@Test
	public void testEquals5() {
		assertTrue(emp3.equals(emp2));
	}
	
	/**
	 * Tests the hash code function of the Employee class.
	 */
	@Test
	public void testHashCode() {
		int expected = 41 * 
                       (41 * 
                        (41 + this.emp1.getName().hashCode()) + 
                          (int)this.emp1.printIncome()) + 
                           this.emp1.getSSN().hashCode();
		
		assertEquals(expected, emp1.hashCode());
	}
	
	/**
	 * Tests the toString method of the Employee class.
	 */
	@Test
	public void testToString() {
		emp1.addLanguage(Languages.English);
		emp1.addLanguage(Languages.German);
		
		String langs = "\n\tLanguages : English , German";
		String expected = "Employee : \n\tName : " + this.emp1.getName() + 
						  "\n\tBase salary : " + this.emp1.printIncome() + 
						  "\n\tSSN : " + this.emp1.getSSN() + 
						  langs;
		
		assertEquals(expected, emp1.toString());
	}
	
	/**
	 * Tests the getName method of class Employee.
	 */
	@Test
	public void testGetName() {
		assertEquals(emp1.getName() , "EMP1");
	}
	
	/**
	 * Tests the printSalary method of class Employee.
	 */
	@Test
	public void testIncome() {
		assertEquals(emp1.printIncome() , 2000.0 , 10);
	}
	
	/**
	 * Test the getSSN method of class Employee.
	 */
	@Test
	public void testSSN() {
		assertEquals(emp1.getSSN() , "ABCDE12345");
	}
	
	@Test
	public void testLanguagesFunctions1() {
		this.emp1.addLanguage(Languages.English);
		this.emp1.addLanguage(Languages.French);
		assertEquals(this.emp1.getLanguages().size() , 2);
	}
	
	@Test
	public void testLanguagesFunctions2() {
		this.emp1.addLanguage(Languages.English);
		this.emp1.addLanguage(null);
		assertEquals(this.emp1.getLanguages().size() , 1);
	}
	
	@Test
	public void testLanguagesFunctions3() {
		this.emp1.addLanguage(Languages.English);
		this.emp1.addLanguage(Languages.English);
		assertEquals(this.emp1.getLanguages().size() , 1);
	}
	
	@Test
	public void testLanguagesFunctions4() {
		this.emp1.addLanguage(Languages.English);
		this.emp1.addLanguage(Languages.German);
		assertTrue(this.emp1.removeLanguage(Languages.English));
	}
	
	@Test
	public void testLanguagesFunctions5() {
		this.emp1.addLanguage(Languages.English);
		this.emp1.addLanguage(Languages.German);
		assertFalse(this.emp1.removeLanguage(Languages.French));
	}
	
	@Test
	public void testLanguagesFunctions6() {
		this.emp1.addLanguage(Languages.English);
		this.emp1.addLanguage(Languages.German);
		assertFalse(this.emp1.removeLanguage(null));
	}
}