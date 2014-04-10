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
	
	@Test
	  public void testTheCoffeeGuy() {
		GreekEmployee grempcg = new GreekEmployee("JohnDoe", 600, "PHD", 30, 10);
	    assertEquals(1350, grempcg.printIncome(), 0.1);
	  }



}
