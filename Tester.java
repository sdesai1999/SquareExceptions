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

        try {
            Square s3 = new Square("f");
            System.out.println(s3.getRank()); // shouldn't be executed
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            String newName = "";
            Square s4 = new Square(newName);
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            String newName1 = "///sdf;lsdfjlas;kdjfa;lskfj;aslkjf;laskfj";
            Square testSq = new Square(newName1);
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            char s5f = 'g';
            char s5r = '1';
            Square s5 = new Square(s5f, s5r);
            assertEquals(s5f, s5.getFile());
            assertEquals('1', s5.getRank());
            assertEquals("g1", s5.toString());
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            char s6f = 'j';
            char s6r = '8';
            Square s6 = new Square("" + s6f + s6r);
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