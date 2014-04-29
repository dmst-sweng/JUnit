package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Trainer;


public class TrainerTest {
	
	  @Test
	  public void test_record() {
	      //System.out.println("Test if you are a good runner control works properly") ;
	      Trainer s = new Trainer(112.2,8.5);
	      assertTrue(s.record() == "good");
	   }

	  @Test
	  public void test_totalRunning() {
	     // System.out.println("Test if your total run works properly") ;
	      Trainer s2 = new Trainer(112.2,8.5);
	      assertTrue(s2.totalRuning() == 112.2);
	   }
}
