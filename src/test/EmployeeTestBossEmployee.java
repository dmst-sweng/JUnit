package test;

import static org.junit.Assert.*;

import main.BossEmployee;

import org.junit.Test;

public class EmployeeTestBossEmployee {

	@Test
	public void testPrintIncome() {
		BossEmployee be = new BossEmployee("Stelios", 900, 180, 60, 500);
	    assertEquals(12200, be.printIncome(), 0.1);
	  }

}
