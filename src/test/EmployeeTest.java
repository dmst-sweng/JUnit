package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Employee;

public class EmployeeTest {

  @Test
  public void testPrintIncome() {
    Employee e = new Employee("John", 1250.50);
    assertEquals(1250.50, e.printIncome(), 0.1);
  }

}
