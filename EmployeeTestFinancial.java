package test;

import static org.junit.Assert.*;
import main.FinancialEmployee;
import org.junit.Test;

public class EmployeeTestFinancial {

	@Test
	  public void testPrintIncome() {
		FinancialEmployee fe = new FinancialEmployee("Bill", 1200, 2, 100, 4, 20, 3, 12);
	    assertEquals(1356, fe.printIncome(), 0.1);
	  }
}
