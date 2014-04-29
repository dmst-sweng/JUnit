package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.SecretaryEmployee;


public class EmployeeTestSecretary {
  @Test
  public void testPrintIncome() {

	  SecretaryEmployee se = new SecretaryEmployee("Anna", 850, 5,10);
	  assertEquals(800, se.printIncome(), 0.1);

 }

}