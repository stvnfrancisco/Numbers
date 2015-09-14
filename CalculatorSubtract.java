import java.io.Console;

public class CalculatorSubtract {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me two numbers to subtract.");
    String stringNumber = myConsole.readLine();
    String stringNumberTwo = myConsole.readLine();

    Integer yourNumber = Integer.parseInt(stringNumber);
    Integer yourNumberTwo = Integer.parseInt(stringNumberTwo);
    Integer yourSubtractedNumbers = yourNumber - yourNumberTwo;

    String stringSubtractedNumbers = Integer.toString(yourSubtractedNumbers);
    System.out.println("Results: " + stringSubtractedNumbers);
  }
}
