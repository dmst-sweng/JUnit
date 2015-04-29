package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.DealerEmployee;

public class EmployeeTestDealer {

	@Test
	public void	testprintTotalIncome() {

		DealerEmployee de = new DealerEmployee("John Smith", 1000, 20000, 0.1);
		assertEquals(3000, de.printIncome(), 0);

		  }
	}