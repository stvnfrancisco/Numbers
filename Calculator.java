import java.io.Console;

public class Calculator {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me two numbers to add together.");
    String stringNumber = myConsole.readLine();
    String stringNumberTwo = myConsole.readLine();

    Integer yourNumber = Integer.parseInt(stringNumber);
    Integer yourNumberTwo = Integer.parseInt(stringNumberTwo);
    Integer yourAddedNumbers = yourNumber + yourNumberTwo;

    String stringAddedNumbers = Integer.toString(yourAddedNumbers);
    System.out.println("Results: " + stringAddedNumbers);
  }
}
