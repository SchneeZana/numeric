public class Numeric {

        public static boolean isOdd(int value) {
            return value % 2 != 0;
        }

        public static boolean isEven(int value) {
            return value % 2 == 0;
        }

        public static int square(int value) {
            return value * value;
        }

        public static int cube(int value) {
            return value * value * value;
        }

        public static void main(String[] args) {

            System.out.println("Is 5 odd? " + isOdd(5));
            System.out.println("Is 8 odd? " + isOdd(8));


            System.out.println("Is 5 even? " + isEven(5));
            System.out.println("Is 8 even? " + isEven(8));

            System.out.println("Square of 5: " + square(5));
            System.out.println("Square of 8: " + square(8));


            System.out.println("Cube of 5: " + cube(5));
            System.out.println("Cube of 8: " + cube(8));
        }
    }

