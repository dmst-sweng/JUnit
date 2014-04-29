package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Employee;

public class EmployeeDismissalTest {
	@Test
	public void testDismissEmployee() {
		Employee employee = new Employee("Bazz", 1050.20);
		employee.dismissEmployee();
		assertEquals(false, employee.isEmployeeDismissed());
	}
}
