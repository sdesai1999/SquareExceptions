/**
 * Extends the Exception class; will be thrown if an impossible square is
 * attempted to be created.
 * This exception is a checked exception, because I added a throws clause in the
 * Square constructors and I use a try catch block in my Tester class.
 *
 * @author sdesai88
 * @version 10/24/17
*/
public class InvalidSquareException extends Exception {

    /**
     * Creates an InvalidSquareException by calling the constructor in the
     * Exception class (parent class).
     *
     * @param square : the name of the invalid Square
    */
    public InvalidSquareException(String square) {
        super(square);
    }
}