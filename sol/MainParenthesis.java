package sol;
import sol.ParenthesisExceptionStencil;
import sol.ParenthesisChecker;

/**
 * Class contains the main method to demonstrate the usage of ParenthesisChecker.
 */
public class MainParenthesis {

  /**
   * The entry point of the program.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

    ParenthesisChecker checker = new ParenthesisChecker();

    try {
      // TODO: Task 9, fill out the try block!
    } catch (ParenthesisExceptionStencil e) {
      System.out.println("Encountered an error: " + e.getErrorMessage());
    }
  }
}