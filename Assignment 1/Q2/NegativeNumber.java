/* Write a Java program that checks if a predefined number is negative using an
if-else statement and displays the result. */

public class NegativeNumber {
    public static void main(String[] args) {
        
        int number = -8; 

        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println("The number is exactly zero.");
        }
    }
}