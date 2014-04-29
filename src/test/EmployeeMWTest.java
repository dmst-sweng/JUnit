package test;

import static org.junit.Assert.*;
import main.Employee;

import org.junit.Test;

public class EmployeeMWTest {

	@Test
	public void testPrintMonthlyWage() {
		
		Employee e = new Employee ("george", 12000);
		assertEquals(1000, e.printMonthlyWage(), 0);
	}

}
