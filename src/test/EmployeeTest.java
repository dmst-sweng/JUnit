package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		int expected = 41 * (41 * (41 + this.emp1.getName().hashCode()) + (int)this.emp1.printIncome()) + this.emp1.getSSN().hashCode();
		assertEquals(expected, emp1.hashCode());
	}
}