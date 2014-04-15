package test;

import static org.junit.Assert.*;
import main.WorkerEmployee;

import org.junit.Test;

public class EmployeeTestWorkerEmployee {

	@Test
	  public void testPrintIncome() {
		WorkerEmployee we = new WorkerEmployee("james", 1200, 200, 10);
	    assertEquals(3200, we.printIncome(), 0.1);
	  }
}