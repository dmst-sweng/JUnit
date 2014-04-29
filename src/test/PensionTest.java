package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Pension;

public class PensionTest {

	private Pension p1;
	private Pension p2;
	private Pension p3;
	
	/**
	 * Runs before every test.
	 */
	@Before
	public void setUp() {
		p1 = new Pension(20 , 2000, true , 3);
		p2 = new Pension(35 , 2000, true , 3);
		p3 = new Pension(35 , 2000, false , 3);
	}
	
	/**
	 * Runs after every test.
	 */
	@After
	public void tearDown() {
		p1 = null;
		p2 = null;
		p3 = null;
	}
	
	@Test
	public void testNoPension() {
		assertEquals(0, p1.calculatePension(), 0.1);
	}
        
 	@Test
	public void testPension1() {
		assertEquals(2250, p2.calculatePension(), 0.1);
	}
        
 	@Test
	public void testPension2() {
		assertEquals(2150, p3.calculatePension(), 0.1);
	}
  

}