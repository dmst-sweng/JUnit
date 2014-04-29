package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.SalaryYearIcreaseEmployee;

public class YearIncreaseTest {

	@Test
	public void	testtotalYearsSalary() {

		SalaryYearIcreaseEmployee syie = new SalaryYearIcreaseEmployee("Myron Karadimas",5000,10);
		assertTrue(syie.totalYearsSalary() == 7500) ;

		  }
	}