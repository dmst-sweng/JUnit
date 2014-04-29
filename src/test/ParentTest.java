package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.ParentEmployee;

public class ParentTest {

	@Test
	public void	testprintIncome() {
		
		ParentEmployee par = new ParentEmployee("John Doe",3000, 2);
		assertEquals(3000,par.printIncome(),3100);
		   
		  }
	}