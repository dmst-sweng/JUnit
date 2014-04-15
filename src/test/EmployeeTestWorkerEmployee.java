package test;

import static org.junit.Assert.*;
import main.FinancialEmployee;
import org.junit.Test;

public class EmployeeTestWorkerEmployee {

	@Test
	  public void testPrintIncome() {
		FinancialEmployee fe = new FinancialEmployee("John", 1200, 200, 10);
	    assertEquals(3200, fe.printIncome(), 0.1);
	  }
}
