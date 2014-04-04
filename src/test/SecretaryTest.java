package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.SecretaryEmloyee;

public class SecretaryTest {
  @Test
  public void testPrintIncome() {
	  SecretaryEmloyee se = new SecretaryEmloyee("Anna", 850, 0, 0.1);
	  assertEquals(850, se.printIncome(), 0.1);
   
  }

}
