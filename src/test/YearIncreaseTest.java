package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.SalaryYearIncreaseEmployee;

public class YearIncreaseTest {

	@Test
	public void	testtotalYearsSalary() {

		SalaryYearIncreaseEmployee syie = new SalaryYearIncreaseEmployee("Myron Karadimas",5000,10);
		assertTrue(syie.totalYearsSalary() == 7500) ;

		  }
	}