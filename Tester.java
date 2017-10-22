public class Tester {
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
    }
}