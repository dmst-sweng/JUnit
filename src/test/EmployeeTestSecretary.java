+package test;

import static org.junit.Assert.*;



import org.junit.Test;

import main.SecretaryEmployee;



public class EmployeeTestSecretary {

  @Test

  public void testPrintIncome() {

	  SecretaryEmployee se = new SecretaryEmployee("Anna", 850, 0, 0.1);

	  assertEquals(850, se.printIncome(), 0.1);



  }



}