package sol;
import java.util.HashMap;
import sol.ParenthesisExceptionStencil;
import java.util.Stack;

/**
 * Class representing a Parenthesis Checker for validating the correctness of parentheses in a string.
 */
public class ParenthesisChecker {

  /**
   * A mapping of opening to closing parentheses.
   */
  private static final HashMap<Character, Character> parentheses_match = new HashMap<>();
  // TODO: Task 10. Populate parentheses_match.

  /**
   * The stack used to keep track of opening parentheses during the checking process.
   */
  private final Stack<Character> stack;


  /**
   * Constructs a new ParenthesisChecker with an empty stack.
   */
  public ParenthesisChecker() {

    // TODO: Task 11, Properly initialize the stack.
    this.stack = null;
  }

  /**
   * Checks the given string for balanced parentheses.
   *
   * @param toCheck The string to be checked for balanced parentheses.
   * @throws ParenthesisExceptionStencil If the string contains unmatched or mismatched parentheses.
   */
  public void parenthesisChecker(String toCheck) throws ParenthesisExceptionStencil {

    // For every letter in the string
    for (int i = 0; i < toCheck.length(); i++) {
      char letter = toCheck.charAt(i);

      // If it's an opening parenthesis, add it to the stack
      if (parentheses_match.containsKey(letter)) {
        // TODO: Task 12, Complete the logic for what if there is an opening parenthesis in your string
      }

      // If it's a closing parenthesis, check if it matches the last opening parenthesis
      if (parentheses_match.containsValue(letter)) {
        if (this.stack.isEmpty()) {
          // TODO: Task 12, what if the stack is empty meaning there is no opening parenthesis to
          //    match? We want to throw an exception!
        }

        // Knowing that the stack is not empty, pop and check that the last item in the stack
        // matches the opening parenthesis of the current closing parenthesis.
        char last = this.stack.pop();

        if (parentheses_match.get(last) != letter) {
          // TODO: Task 12, what if the last item in the stack isn't the match for the current
          //  closing parenthesis?
        }
      }
    }

    // Check if there are unmatched opening parentheses
    if (!this.stack.isEmpty()) {
      // TODO: Task 12, what if the stack is not empty when we finish iterating through our string?
    }
  }
}
