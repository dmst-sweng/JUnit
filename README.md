JUnit
=====

A pet project for learning JUnit.

Assignment guide
==

Each student is expected to contribute a piece of source code
(a new class or method) and the tests that validate this piece
of source code.
According to Test Driven Development (TDD), we encourage you to 
write the tests first and then the code. By writing the tests first,
you agree that the relevant code will have specific functionality.

Please commit tests and source code separately.

Deadline: 29 April

Building and execution
==

* Eclipse
  
  As you can see this is now an Eclipse Java project
  so you can import it easily and work through the IDE. It should 
  be built automatically. You can then run it as a Java application
  or as a JUnit test (to run the test cases).

* Command-line:

 - Compile with: javac -cp path/to/junit/junit-x.x.x.jar main/\*.java test/\*.java
 - Execute application with: java -classpath path/to/junit/4.8.2/junit-x.x.x.jar:. main.EmployeeRegistry
 - Execute tests with: java -classpath path/to/junit/junit-x.x.x.jar:. test.EmployeeTestRunner

Notes
==

 - If you are using a command-line tool like Git bash at the lab's Windows machines pay attention not
   to place the junit jar inside the W: disk. Paths to this disk do not work properly (hence the problem
   we had last time trying to tell javac where junit jar was).
 - Please configure your username and email with Git in order to have your commits appear under your name.
   - git config --global user.name "Marios Fragkoulis"
   - git config --global user.email mfg@aueb.gr
