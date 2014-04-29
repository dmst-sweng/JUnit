package test;

import static org.junit.Assert.*;
import main.SandwitchGuy;
import org.junit.Test;

public class SandwitchGuyTest {
	
	@Test
	public void testprintIncome() {
		SandwitchGuy swd = new SandwitchGuy("Bob", 500, 3);
		assertEquals(500, swd.printIncome(),600);
	}

}
