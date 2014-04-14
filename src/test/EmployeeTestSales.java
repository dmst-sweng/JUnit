package test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import main.SalesEmployee;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTestSales {

	SalesEmployee se;
	
	@Before
	public void beforeTest() {
		se = new SalesEmployee("Mayra", 600, 7, 0.5f, 32000);
	}
	
	/**
	 * Perform after each test
	 */
	@After
	public void afterTest() {
		se = null;
	}
	@Test
	public void testEmployeeIncomeTrue() {
		assertEquals(16642, se.EmployeeIncome(7, 0.5f), 0.1);
	}
	
	@Test
	public void testEmployeeIncomeFalse() {
		assertNotSame(6000, se.EmployeeIncome(7, 0.5f));
	}

	@Test
	public void testSalesEmployeeToString() {
		DecimalFormat f = new DecimalFormat("0.00");
		String exp = "Name: " + se.getName() + "  " +"Final Income: " + f.format(se.EmployeeIncome(se.overTimeHours, se.commission)) + " Euros";
		assertEquals(exp, se.toString() );
	}
}
