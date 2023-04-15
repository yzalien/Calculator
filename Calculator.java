import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class Calculator {
  private Scanner console = new Scanner(System.in);
  
  private void addition () {
    // Steps for function:
    // Ask user for first number in equation
    // Ask user for second number in equation
    // Calculate result
    // Print result
    try { 
      double[] numbers = getInputs();
      
      double result = numbers[0];
      for(int i = 1; i < numbers.length; i++){
        result = result + numbers[i];
      }
      
      // "\n" means a new line break, you can also use System.lineSeparator() but like... don't
      // https://www.educative.io/answers/how-to-use-the-printf-function-in-java
      // System.out.println(num1 + " + " + num2 + " = " + result);
      printResult(numbers, result, "+");
    } catch(InputMismatchException e) {
      console.next(); // prevents from exiting | consumes the next line character (\n)
      System.out.println("Invalid input.");
    }
  }

  private void subtraction () {
    try {
      double[] numbers = getInputs();
      
      double result = numbers[0];
      for(int i = 1; i < numbers.length; i++){
        result = result - numbers[i];
      }
        
      printResult(numbers, result, "-");
    } catch(InputMismatchException e) {
      console.next();
      System.out.println("Invalid input.");
    }
  }

  private void multiplication () {
    try {
      double[] numbers = getInputs();
      
      double result = numbers[0];
      for(int i = 1; i < numbers.length; i++) {
        result = result * numbers[i];
      }
      
      printResult(numbers, result, "x");
    } catch(InputMismatchException e) {
      console.next();
      System.out.println("Invalid input");
    }
  }

  private void division () {
    try {
      double[] numbers = getInputs();
      
      double result = numbers[0];
      for(int i = 1; i < numbers.length; i++) {
        result = result / numbers[i];
      }
          
      printResult(numbers, result, "/");
    } catch(InputMismatchException e) {
      console.next();
      System.out.println("Invalid input");
    }
  }

  private void printResult (double[] numbers, double result, String sign) {
    DecimalFormat df = new DecimalFormat();
    
    String resultString = "The result of";
    for(int i = 0; i < numbers.length; i++) {
      if (i + 1 == numbers.length) {
        resultString = resultString + " " + df.format(numbers[i]);
      } else {
        resultString = resultString + " " + df.format(numbers[i]) + " " + sign;
      }
    }
    resultString = resultString + " is " + df.format(result);
    
    System.out.print("\033[H\033[2J");
    System.out.println(resultString);
  }

  private double[] getInputs () {
    System.out.print("How many numbers would you like to work with?: ");
    int numCount = console.nextInt();

    double[] inputs = new double[numCount];
    for(int i = 0; i < numCount; i++) {
      System.out.printf("Enter the %d number in the equation: ", i+1);
      inputs[i] = console.nextDouble();
    }

    return inputs;
  }


  public void run () {
    try {
      while (true) {
        System.out.println("Calculator App");
        System.out.println("Which operation would you like to perform? (Enter anything else to exit)");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Selection: ");
        int selection = console.nextInt();
        System.out.println();
        
        switch(selection) {
          case 1:
            addition();
            break;
          case 2:
            subtraction();
            break;
          case 3:
            multiplication();
            break;
          case 4:
            division();
            break;
          default:
            System.out.println("Invalid option selected.");
            break;
        }

        System.out.println();
      }
    } catch(InputMismatchException e) {
      System.out.println("Exiting program");
    }
    console.close();
  }
}
