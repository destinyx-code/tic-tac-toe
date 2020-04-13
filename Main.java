// library imports
import java.util.scanner;

// main class
public class Main {

  // compiled code allow for java
  public static void Main(String[] args) {

    // string variables for moves
    String a1 = "a1";
    String a2 = "a2";
    String a3 = "a3";
    String b1 = "b1";
    String b2 = "b2";
    String b3 = "b3";
    String c1 = "c1";
    String c2 = "c2";
    String c3 = "c3";

    // creates a scanner object to read user's input
    Scanner object = new Scanner(System.in);

    // prints "Choose your first move." to the console
    System.out.println("Choose your first move.");

    // creates the string variable for the user's input
    String firstUserMove = object.nextLine();

      switch (firstUserMove) {
        case a1 :
          System.out.println(a2 || a3 || b1 || b2 || b3 || c1 || c3);
          break;
        case a2 :
          System.out.println(a1 || a3 || b2 || c2);
          break;
        case a3 :
          System.out.pritnln(a1 || a3 || b1 || b2 || b3 || c1 || c3);
          break;
        case b1 :
          System.out.println(b2 || b3 || a1 || c1);
          break;
        case b2 :
      }

  }
}
