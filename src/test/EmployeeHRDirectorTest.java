package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.HRDirector;

public class EmployeeHRDirectorTest {
	@Test
	public void testPrintIncome() {
		HRDirector hr = new HRDirector("Maria", 1050.20);
		assertEquals(1050.00, hr.printIncome(), 0.1);
	}
}