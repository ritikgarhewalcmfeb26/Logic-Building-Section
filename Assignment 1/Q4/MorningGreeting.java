/* Write a Java program that displays a "Good Morning" message if the
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.*/

public class MorningGreeting {

    public static void main(String[] args) {
              
        int time = 9; 

            if (time >= 5 && time < 12) {
            System.out.println("Good Morning!");
        }
    }
}