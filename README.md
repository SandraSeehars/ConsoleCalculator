
ConsoleCalculator
=================
*BBW school project: a simple console calculator with Maven, UnitTests and Travis*
----------------------------------------------------------------------------------
> Der Weg ist das Ziel.
_Konfuzius_

**Some quiz questions**<br>
[Why Maven](#why-maven)<br>
[Why Unit testing](#why-unit-testing)<br>
[Why Travis](#why-travis)<br>

![Avatar of @SandraSeehars](https://raw.githubusercontent.com/SandraSeehars/ConsoleCalculator/master/mangatar.png)

<dl>
  <dt>Maven project</dt>
  <dd>written in Java</dd>
  <dd>IDE: Eclipse Proton</dd>

  <dt>Included are</dt>
  <dd>Unit tests </dd>
  <dd>Travis</dd>
  
  <dt>What it does</dt>
  <dd>the Calculator class sums, subtracts and divides two numbers</dd>
  <dd>the Application class prints out the results in the console (see code snippet below :arrow_down: )</dd>
  <dd>the CalculatorTest class is used for Unit tests</dd>
  <dd>the Apptest class prints out the Unit tests results</dd>
</dl>

```

public class Calculator {
    public int sum(int summand1, int summand2) {
		return summand1 + summand2; 
        }
}

public class App {
    public static void main( String[] args ) {
    	Calculator calculator = new Calculator();
    	int valueA = 0;
    	int valueB = 0;
    	
        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();
        
        valueA = 10; 
        valueB = 20;
        System.out.println("Sum " + valueA + " + " + valueB + " = " + calculator.sum(10, 20));
    }
}
```

# Why Maven

Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation. It simplifies the build process like ANT. In short terms we can tell maven is a tool that can be used for building and managing any Java-based project.
[Source](https://www.geeksforgeeks.org/introduction-apache-maven-build-automation-tool-java-projects/)

# Why Unit testing

Peace of mind

As programmers, we are trained to worry. It becomes second nature to think about what might go wrong. And this tendency to overthink slips from work into our personal lives.

Unit tests help to eliminate worry. A well-tested module is something you can trust. It tells you “everything is going to be all right, trust me”. It’s an island of stability in a messy codebase, and it’s one less thing to worry when making changes to the system.
[Source](https://medium.com/@corneliu/unit-testing-why-3490d08e89f2)

# Why Travis

What is Continuous Integration (CI)? Continuous Integration is the practice of merging in small code changes frequently - rather than merging in a large change at the end of a development cycle. The goal is to build healthier software by developing and testing in smaller increments. This is where Travis CI comes in.

As a continuous integration platform, Travis CI supports your development process by automatically building and testing code changes, providing immediate feedback on the success of the change. Travis CI can also automate other parts of your development process by managing deployments and notifications.
[Source](https://docs.travis-ci.com/user/for-beginners/)

