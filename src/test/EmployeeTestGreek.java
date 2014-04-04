package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.GreekEmployee;

public class EmployeeTestGreek {
	@Test
	  public void testPrintIncome() {
		GreekEmployee gremp = new GreekEmployee("Manolis", 600, "PHD", 30, 10);
	    assertEquals(1300, gremp.printIncome(), 0.1);
	  }


}
