package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Trainer;


public class TrainerTest {
	
	  @Test
	  public void test_returnEuro() {
	      System.out.println("Test if you are a good runner") ;
	      Trainer s = new Trainer(112.2,11.5);
	      assertTrue(s.record(100.4,10.2) == "good");
	   }


}
