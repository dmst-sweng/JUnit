package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmployeeTestRunner {
   public static void main(String[] args) {
      Result resultEmp = JUnitCore.runClasses(
    		  Accountant_AllowanceTest.class,
    		  BonusTest.class,
    		  EducationProgTest.class,
    		  EmploeeTestAdministration.class,
    		  EmployeeDismissalTest.class,
    		  EmployeeHRDirectorTest.class,
    		  EmployeeMWTest.class,
    		  EmployeePartTimeTest.class,
    		  EmployeeTest.class,
    		  //EmployeeTestAccount.class,
    		  EmployeeTestAdmin.class,
    		  EmployeeTestBossEmployee.class,
    		  EmployeeTestFinancial.class,
    		  EmployeeTestGreek.class,
    		  EmployeeTestLogistics.class,
    		  EmployeeTestMarketing.class,
    		  EmployeeTestSales.class,
    		  EmployeeTestSecretary.class,
    		  EmployeeTestTech.class,
    		  EmployeeTestWorker.class,
    		  ParentTest.class,
    		  PensionTest.class,
    		  SandwitchGuyTest.class,
    		  TrainerTest.class,
    		  TranslationTestEmployee.class,
    		  YearIncreaseTest.class);
	  	
      for (Failure failure : resultEmp.getFailures()) {
		System.out.println(failure.toString());
      	}
	  	System.out.println(resultEmp.wasSuccessful());}
  }
  
