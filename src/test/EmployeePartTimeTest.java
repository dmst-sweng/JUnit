package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.PartTimeEmployee;

public class EmployeePartTimeTest 
{
	@Test
	public void testIncome()
	{
		PartTimeEmployee pte = new PartTimeEmployee("Vassilis",0,4,6,10.0);
		assertEquals(240.0,pte.printIncome(),0.1);
	}
	
	
}
