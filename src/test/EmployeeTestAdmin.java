package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.AdminEmployee;

public class EmployeeTestAdmin{

	/**
	 * An AdminEmployee
	 */
	private AdminEmployee ae;
	
	
	/**
	 * Perform before each test.
	 */
	@Before
	public void setUp() {
		ae = new AdminEmployee("Alfred", 1600, 0);
	}
	
	/**
	 * Perform after each test.
	 */
	@After
	public void tearDown() {
		ae=null;
	}
	@Test
	  public void testPrintIncome() {
		//AdminEmployee ae = new AdminEmployee("Alfred", 1600, 0);
	    assertEquals(1600, ae.printIncome(), 0.1);
	  }

	@Test
	public void testSetBonus() {
		ae.setBonus(245);
		assertEquals(245, ae.getBonus(), 0.1);
	}
	}


