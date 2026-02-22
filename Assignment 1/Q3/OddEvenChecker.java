/* Write a Java program that checks if a predefined number is odd or even. Use
an if-else statement and the modulus operator (%) to determine whether the number is
divisible by 2 or not */

public class OddEvenChecker {
    public static void main(String[] args) {

        int number = 17;

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {

            System.out.println(number + " is an odd number.");
        }
    }
}