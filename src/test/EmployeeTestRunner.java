/* Compile with: javac -cp ~/.m2/repository/junit/junit/4.8.2/junit-4.8.2.jar main/*.java test/*.java
 * Execute application with: java -classpath ~/.m2/repository/junit/junit/4.8.2/junit-4.8.2.jar:. main.EmployeeRegistry
 * Execute tests with: java -classpath ~/.m2/repository/junit/junit/4.8.2/junit-4.8.2.jar:. test.EmployeeTestRunner
 */
package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmployeeTestRunner {
   public static void main(String[] args) {
      Result resultEmp = JUnitCore.runClasses(EmployeeTest.class,EmployeeTestAdmin.class);
	  	
      for (Failure failure : resultEmp.getFailures()) {
		System.out.println(failure.toString());
		}
	  	System.out.println(resultEmp.wasSuccessful());}
  }
  /**/