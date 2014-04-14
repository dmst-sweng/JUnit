package test;

import static org.junit.Assert.*;
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
		String exp = "Name: " + se.getName() + "\nFinal Income: " + se.EmployeeIncome(se.overTimeHours, se.commission) + " Euros";
		assertEquals(exp, se.toString() );
	}
}
