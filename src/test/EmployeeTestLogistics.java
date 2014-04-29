package test;

import static org.junit.Assert.*;
import main.LogisticsEmployee;

import org.junit.Test;

public class EmployeeTestLogistics {

	@Test
	public void testPrintIncome() {
		LogisticsEmployee le = new LogisticsEmployee("Helen", 1000, 178, 14, 700);
	    assertEquals(4192, le.printIncome(), 0.1);
	  	}
	
	public void testPrintIncomePerYear() {
		LogisticsEmployee le = new LogisticsEmployee("Helen", 1000, 178, 14, 700);
	    assertEquals((4192*12), le.printIncomePerYear(), 0.1);
	  	}

}
