package test;

import static org.junit.Assert.*;
import main.FinancialEmployee;
import org.junit.Test;

public class EmployeeTestFinancial {

	@Test
	  public void testPrintIncome() {
		FinancialEmployee fe = new FinancialEmployee("Bill", 1200, 2, 100, 4, 20);
	    assertEquals(1320, fe.printIncome(), 0.1);
	  }
}
