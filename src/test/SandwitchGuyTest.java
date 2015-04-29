package test;

import static org.junit.Assert.*;
import main.SandwitchGuy;
import org.junit.Test;
import etc.SandwitchType;

public class SandwitchGuyTest {
	
	@Test
	public void testprintIncome() {
		SandwitchType simple = SandwitchType.simple;
		SandwitchGuy swd = new SandwitchGuy("Bob", 0, 400, simple);
		assertEquals(800, swd.printIncome(), 0);
	}

}
