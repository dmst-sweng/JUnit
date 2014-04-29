package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.GreekEmployee;

public class EmployeeTestGreek {
	
	/**
	 * Two  GreekEmployees,
	 * The second one is also the coffee guy,
	 */
	
	private GreekEmployee gremp;
	private GreekEmployee grempcg;
	

	/**
	 * Perform before each test.
	 */
	
	@Before
	public void beforeTest() {
	   gremp = new GreekEmployee("Manolis", 600, "PHD", 30, 10);
       grempcg = new GreekEmployee("JohnDoe", 600, "PHD", 30, 10);
	}
	
	/**
	 * Perform after each test.
	 */
	
	@After
	public void afterTest() {
		gremp = null;
		grempcg = null;
	}
	
	
	@Test
	  public void testPrintIncomeTrue() {
	     assertEquals(1300, gremp.printIncome(), 0.1);
	}
	  
	@Test
	  public void testPrintIncomeFalse() {
	     assertEquals(1500, gremp.printIncome(), 0.1);
	  
	  
	  }
	
	@Test
	  public void testTheCoffeeGuyTrue() {
		   assertEquals(1350, grempcg.printIncome(), 0.1);
		   
	  }

	@Test
	  public void testTheCoffeeGuyFalse() {
		   assertEquals(1550, grempcg.printIncome(), 0.1);
	  }

}
