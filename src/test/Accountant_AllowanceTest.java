package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Accountant_Allowance;

public class Accountant_AllowanceTest{

@Test
	public void	testSumAllowance() {

		Accountant_Allowance al= new Accountant_Allowance("Bill Anderson",2000,600);
		assertTrue(al.printSumAllowance() == 2600) ;

		  }
	}




