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
      Result result = JUnitCore.runClasses(EmployeeTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}

