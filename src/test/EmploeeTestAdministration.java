package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.AdministrationEmployee;



public class EmploeeTestAdministration {
	@Test
	public void	testprintIncome() {
		
		AdministrationEmployee ade = new AdministrationEmployee("John Mak", 5000, 4);
		assertEquals(5000,ade.printIncome(),5320);
		   
		  }
}
