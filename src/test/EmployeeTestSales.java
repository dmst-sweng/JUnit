package test;

import static org.junit.Assert.*;

import main.SalesEmployee;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTestSales {

	SalesEmployee se;
	
	@Before
	public void beforeTest() {
		se = new SalesEmployee("Mayra", 600, 7, 0.5f, 32000);
	}
	
	@Test
	public void testEmployeeIncomeTrue() {
		assertEquals(16642, se.EmployeeIncome(7, 0.5f), 0.1);
	}
	
	@Test
	public void testEmployeeIncomeFalse() {
		assertNotSame(6000, se.EmployeeIncome(7, 0.5f));
	}

}
