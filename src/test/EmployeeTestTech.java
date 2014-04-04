package test;


import static org.junit.Assert.*;
import org.junit.Test;
import main.TechEmployee;

public class EmployeeTestTech {

  @Test
  public void testPrintIncome() {
	 TechEmployee te = new TechEmployee("Bob", 1400, 0, 10.5);
	 te.setOvertimeHours(10); 
    assertEquals(1505, te.printIncome(), 0.1);
   
  }

}
