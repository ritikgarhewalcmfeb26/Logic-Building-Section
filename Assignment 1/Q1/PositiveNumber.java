/* Write a Java program that checks if a predefined number is positive using an
if-else statement and prints the appropriate message. */

public class PositiveNumber {
    public static void main(String[] args) {
        int number = 15; 

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is not a positive number.");
        }
    }
}