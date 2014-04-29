package test;

import static org.junit.Assert.*;

import main.MarketingEmployee;

import org.junit.Test;

public class EmployeeTestMarketing {

	@Test
	public void testPrintIncome() {
		MarketingEmployee me = new MarketingEmployee("Costas", 1100, 180, 15, 500);
	    assertEquals(4300, me.printIncome(), 0.1);
	  }

}
