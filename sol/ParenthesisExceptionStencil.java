package sol;

/**
 * Checked exception class for representing errors related to mismatched parentheses.
 * This exception is thrown when an invalid number of parentheses is encountered.
 */
public class ParenthesisExceptionStencil extends Exception {
  private final String message;

  /**
   * Default constructor for ParenthesisException.
   * Initializes the error message to a default value.
   */
  public ParenthesisExceptionStencil(){
    this.message = "Invalid number of parenthesis.";
  }

  /**
   * Retrieves the error message associated with this exception.
   *
   * @return The error message as a String.
   */
  public String getErrorMessage(){
    return this.message;
  }

}
