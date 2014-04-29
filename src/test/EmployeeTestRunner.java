package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmployeeTestRunner {
   public static void main(String[] args) {
      Result resultEmp = JUnitCore.runClasses(EmployeeTest.class,
              EmployeeTestAdmin.class,
    		  EmployeeTestTech.class,EmployeeTestSecretary.class,
              EmployeeTestGreek.class,
    		  EmployeeTestFinancial.class,EmployeeTestSales.class,
              EmployeeTestWorker.class,
    		  EmployeePartTimeTest.class,
    		  EmployeeTestFinancial.class,
              EmployeeTestSales.class,
              EmployeeTestWorker.class,
              EmployeeTestMarketing.class,
              TrainerTest.class,
              EmployeeTestLogistics.class,
	      EmployeeTestBossEmployee.class
	      PensionTest.class);
	  	
      for (Failure failure : resultEmp.getFailures()) {
		System.out.println(failure.toString());
      	}
	  	System.out.println(resultEmp.wasSuccessful());}
  }
  
