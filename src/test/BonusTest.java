package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.BonusEmployee;

public class BonusTest {

	@Test
	public void	testprintTotalIncome() {

		BonusEmployee bon = new BonusEmployee("John Smith",2000,60);
		assertTrue(bon.printTotalIncome() == 2060) ;

		  }
	}