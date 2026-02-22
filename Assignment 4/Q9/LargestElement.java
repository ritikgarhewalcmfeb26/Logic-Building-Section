import java.util.Scanner;
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        int largest = numbers[numbers.length - 1];

        System.out.println("The largest element is: " + largest);

        scanner.close();
    }
}