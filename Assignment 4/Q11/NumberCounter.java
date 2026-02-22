import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.print("Enter 6 integers: ");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);

        scanner.close();
    }
}