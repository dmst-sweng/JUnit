package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.AdminEmployee;

public class EmployeeTestAdmin{

	@Test
	  public void testPrintIncomeAdmin() {
		AdminEmployee ae = new AdminEmployee("Alfred", 1600, 0);
	    assertEquals(1600, ae.printIncome(), 0.1);
	  }

	}


