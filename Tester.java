/**
 * class used to test my InvalidSquareException and Square classes
 *
 * @author sdesai88
 * @version 10/24/17
*/
public class Tester {

    /**
     * main method for Tester class
     * @param args : command line arguments
    */
    public static void main(String[] args) throws InvalidSquareException {
        try {
            Square a9 = new Square('a', '9');
            System.out.println("WORKS");
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            Square a3 = new Square("a3");
            System.out.println("WORKS");
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            new Square("j3");
            System.out.println("WORKS");
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            Square e6 = new Square('e', '6');
            System.out.println(e6.toString());
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            Square i9 = new Square("i9");
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        Square h3 = new Square("h3");
        assertEquals(h3.toString(), "h3");
        assertEquals(h3.getFile(), 'h');

        try {
            Square s1 = new Square("s1");
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            Square s2 = new Square('f', '6');
            assertEquals('6', s2.getRank());
            assertEquals(s2.toString(), "f6");
            assertEquals(s2.getFile(), 'f');
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }
    }

    /**
     * uses assert keyword to check if 2 strings are the same
     *
     * @param a : first String
     * @param b : second String
    */
    public static void assertEquals(String a, String b) {
        assert a.equals(b);
        System.out.println(true);
    }

    /**
     * uses assert keyword to check if 2 chars are the same
     *
     * @param a : first char
     * @param b : second char
    */
    public static void assertEquals(char a, char b) {
        assert a == b;
        System.out.println(true);
    }
}