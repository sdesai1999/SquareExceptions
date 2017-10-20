public class Tester {
    public static void main(String[] args) {
        try {
            Square a9 = new Square('a', '9');
            System.out.println("WORKS");
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }

        try {
            Square a3 = new Square("a3");
            System.out.println("WORKS");
            System.out.println(a3);
        } catch (InvalidSquareException e) {
            System.out.printf("ERROR: %s%n", e.getMessage());
        }
    }
}