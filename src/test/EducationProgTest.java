package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import etc.TypesOfEducation;
import main.EducationProg;

public class EducationProgTest {
	
	private  EducationProg prog1;
	private  EducationProg prog2;
	private  EducationProg prog3;
	private  EducationProg prog4;
	private  TypesOfEducation t = TypesOfEducation.Financial;
	private  TypesOfEducation x = TypesOfEducation.Basic;
	private  TypesOfEducation l = TypesOfEducation.Management;
    	private  TypesOfEducation y = TypesOfEducation.Technological;
	
	/**
	 * Runs before every test.   
	 */
	@Before 
	public void setUp() {
		this.prog1 = new EducationProg("prog1", "agaege4", 4.0, 100.0, t);
		this.prog2 = new EducationProg("prog2", "guy89h", 9.0, 400.0, x);
		this.prog3 = new EducationProg("prog3", "guyg897", 5.0, 200.0, l);
		this.prog4 = new EducationProg("prog4", "sn43sb", 2.0, 50.0, y);
	}
	

	/**
	 * Runs after every test.
	 */
	@After
	public void tearDown() {
		this.prog1 = null;
		this.prog2 = null;
		this.prog3 = null;
		this.prog4 = null;
		this.t = null;
		this.x = null;
		this.l = null;
		this.y = null;
	}
	
	/**
	 * Tests the printed code.
	 */
	@Test
	public void testPrintCode() {
		assertEquals(prog1.getCode() , "agaege4");
		assertEquals(prog2.getCode() , "guy89h");
		assertEquals(prog3.getCode() , "guyg897");
		assertEquals(prog4.getCode() , "sn43sb");	
	}
	
	/**
	 * Tests the printed type of education.
	 */
	@Test
	public void testPrintEduType() {
		assertEquals(prog1.getType() , t);
		assertEquals(prog2.getType() , x);
		assertEquals(prog3.getType() , l);
		assertEquals(prog4.getType() , y);
	}
	
}
